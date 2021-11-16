package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		//java.io, java.net, java.sql은 거의 예외가능성이 있는 생성자 또는 메소드다.
		try {
			int port = 8000;
			int cnt = 0; //Client의 접속개수를 count할 변수
			ServerSocket server = new ServerSocket(port);
			System.out.println("ServerSocket Start...");
			while(true) {
				//Client가 접속할 때까지 대기 상태임
				Socket sock = server.accept(); //wait
				EchoThread et = new EchoThread(sock);
				et.start();//결론적으로 run메소드 호출
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Client에 대응을 각각하기 위해 Thread 기능의 내부클래스를 생성한다.
	class EchoThread extends Thread {
		
		Socket sock;
		BufferedReader in; //Client가 보내는 메세지 받는 스트림
		PrintWriter out; //Client로 메세지 보내는 스트림
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true/*auto flush*/);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				//Client가 접속하면 처음으로 받는 메세지
				out.println("Hello Enter BYE to exit");
				while(true) {
					//Client가 메세지 보낼 때까지 대기
					String line = in.readLine();
					if(line==null) { //Client가 접속을 끊을 때
						break; //while문 탈출
					} else {
						//Client에서 온 메세지 앞에 Echo 붙여서 반사
						out.println("Echo : " + line);
						if(line.equalsIgnoreCase("BYE")) {
							break;
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
