package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer1 {
	
	Vector<ClientThread1> vc;
	ServerSocket server;
	
	public ChatServer1() {
		try {
			server = new ServerSocket(8001);
			vc = new Vector<ClientThread1>();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error in Service");
			System.exit(1); //1번은 비정상적인 종료임
		}
		System.out.println("**************************");
		System.out.println("클라이언트 접속을 기다리고 있습니다.");
		System.out.println("**************************");
		try {
			while(true) {
				Socket sock = server.accept();
				ClientThread1 ct = new ClientThread1(sock);
				ct.start();
				vc.addElement(ct); //접속된 클라이언트를 Vector에 저장한다.
			}
		} catch (Exception e) {
			System.err.println("Error in sock");
			e.printStackTrace();
		}
	}
	
	//전체 접속자에게 메세지 전달하기
	public void sendAllMessage(String msg) {
		for (int i = 0; i < vc.size(); i++) {
			//Vector에 있는 ClientThread1을 순차적으로 가져온다.
			ClientThread1 ct = vc.get(i);
			//ClientThread1이 가지고 있는 메세지 전송 메소드를 호출한다.
			ct.sendMessage(msg);
		}
	}
	
	//Vector에서 ClientThread1를 제거(사용자의 접속이 끊기면)
	public void removeClient(ClientThread1 ct) {
		vc.remove(ct);
	}
	
	//내부클래스
	class ClientThread1 extends Thread{
		
		Socket sock;
		BufferedReader in; // Client가 보내는 메세지 받는 스트림
		PrintWriter out; // Client로 메세지 보내는 스트림
		String user;
		
		public ClientThread1(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true/*auto flush*/);
				System.out.println(sock + " 접속됨...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				//Client가 처음으로 받는 메세지
				out.println("사용하실 아이디를 입력하세요.");
				user = in.readLine();
				sendAllMessage("["+user+"]님이 입장하였습니다.");
				String data = "";
				while(true) {
					data = in.readLine(); //메세지 들어올 때까지 대기 상태
					if(data == null)
						break;
					sendAllMessage("["+user+"]"+data);
				}
				in.close();
				out.close();
				sock.close();
			} catch (Exception e) {
				//자신의 객체를 Vector에서 제거한다.
				removeClient(this);
				System.err.println(sock+"끊어짐...");
				//e.printStackTrace();
			}
		}
		
		//Client에게 메세지 전달하는 메소드
		public void sendMessage(String msg) {
			out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		new ChatServer1();
		
	}
}