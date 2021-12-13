package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;

public class ChatServer2 {

	ServerSocket server;
	Vector<ClientThread2> vc;
	int port = 8002;

	public ChatServer2() {
		try {
			server = new ServerSocket(port);
			vc = new Vector<ClientThread2>();
		} catch (Exception e) {
			System.err.println("Error in Server");
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("*Server 2.0**************");
		System.out.println("클라이언트 접속을 기다리고 있습니다.");
		System.out.println("**************************");
		try {
			while (true) {
				Socket sock = server.accept(); // Client 접속 대기 상태
				ClientThread2 ct = new ClientThread2(sock);
				ct.start();// ThreadScheduler에게 등록 -> Scheduler가 시작을 하는 단계
				vc.addElement(ct);// Vector에 추가
			}
		} catch (Exception e) {
			System.err.println("Error in Socket");
			e.printStackTrace();
		}
	}

	// 접속된 모든 클라이언트에게 메세지 전송
	public void sendAllMessage(String msg) {
		for (int i = 0; i < vc.size(); i++) {
			ClientThread2 ct = vc.get(i);
			ct.sendMessage(msg);
		}
	}

	// Vector에서 ClientThread1를 제거(사용자의 접속이 끊기면)
	public void removeClient(ClientThread2 ct) {
		vc.remove(ct);
	}

	class ClientThread2 extends Thread {

		Socket sock;
		BufferedReader in; // Client가 보내는 메세지 받는 스트림
		PrintWriter out; // Client로 메세지 보내는 스트림
		String id = "익명";

		public ClientThread2(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(), true/* auto flush */);
				System.out.println(sock + " 접속됨...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			try {
				// Client에게 최초로 보내는 메세지
				out.println("사용하실 아이디를 입력하세요.");
				while (true) {
					String line = in.readLine();
					if (line == null) {
						break;
					} else {
						routine(line);
					}
				}
			} catch (Exception e) {
				// Client 연결이 끊어질 때 Vector에서 자신의 객체를 제거한다.
				removeClient(this);
				System.err.println(sock + " [" + id + "] 끊어짐");
				// e.printStackTrace();
			}
		}

		// Client로 부터 요청된 문자열을 분석하는 메소드
		public void routine(String line) {
			System.out.println("line : " + line);
			// CHATALL:오늘은 월요일입니다.
			int idx = line.indexOf(":");
			String cmd/* CHATALL */ = line.substring(0, idx);
			String data/* 오늘은 월요일입니다. */ = line.substring(idx + 1);
			if (cmd.equals(ChatProtocol.ID)) {
				// data = aaa
				if (data != null && data.length() > 0) {
					id = data;
					// 새로운 접속자가 추가되었기 때문에 리스트 재전송
					sendAllMessage(ChatProtocol.CHATLIST + ":" + getIds());
					// 모든 접속자에게 입장 메세지를 전송
					sendAllMessage(ChatProtocol.CHATALL + ":" + "[" + id + "]님이 입장하였습니다.");
				}
			} else if (cmd.equals(ChatProtocol.CHAT)) {
				// data : bbb;밥먹자
				idx = data.indexOf(';');
				cmd/* bbb */ = data.substring(0, idx);
				data/* 밥먹자 */ = data.substring(idx);
				// bbb 클라이언트 객체
				ClientThread2 ct = findClient(cmd);
				if (ct != null) {
					ct.sendMessage(ChatProtocol.CHAT + ":" + "[" + id + "(S)]" + data);
				} else {// 내 자신에게 보냄
					sendMessage(ChatProtocol.CHAT + ":" + "[" + cmd + "] 접속자가 아닙니다.");
				}
			} else if (cmd.equals(ChatProtocol.MESSAGE)) {
				idx = data.indexOf(';');
				cmd = data.substring(0, idx);
				data = data.substring(idx);
				ClientThread2 ct = findClient(cmd);
				if (ct != null) {
					ct.sendMessage(ChatProtocol.MESSAGE + ":" + id + ";" + data);
				} else {// 내 자신에게 보냄
					sendMessage(ChatProtocol.CHAT + ":" + "[" + cmd + "] 접속자가 아닙니다.");
				}
			} else if (cmd.equals(ChatProtocol.CHATALL)) {
				sendAllMessage(ChatProtocol.CHATALL+":"+"["+id+"]"+data);
			}
		}

		// 매개변수로 받은 id값으로 ClientThread2를 검색한다.
		public ClientThread2 findClient(String id) {
			ClientThread2 ct = null;
			for (int i = 0; i < vc.size(); i++) {
				ct = vc.get(i);
				if (id.equals(ct.id))
					break;
			}
			return ct;
		}

		// 접속된 모든 아이디 리턴
		public String getIds() {
			String ids = "";
			for (int i = 0; i < vc.size(); i++) {
				ClientThread2 ct = vc.get(i);
				ids += ct.id + ";";// 104라인에서 id값을 넣어준다.
			}
			return ids;// aaa;bbb;홍길동;ccc
		}

		public void sendMessage(String msg) {
			out.println(msg);
		}

	}

	public static void main(String[] args) {
		new ChatServer2();

	}
}