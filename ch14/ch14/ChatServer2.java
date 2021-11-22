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

			} catch (Exception e) {

			}
		}

		// Client로 부터 요청된 문자열을 분석하는 메소드
		public void routine(String line) {

		}

		public void sendMessage(String msg) {

		}

	}

	public static void main(String[] args) {
		new ChatServer2();

	}
}