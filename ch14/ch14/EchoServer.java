package ch14;

import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public EchoServer() {
		try {
			int cnt = 0; //Client의 접속개수를 count할 변수
			ServerSocket server = new ServerSocket(8000);
			System.out.println("ServerSocket Start...");
			while(true) {
				Socket sock = server.accept(); //wait
				
				cnt++;
				System.out.println("Client"+cnt+"Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Client 담당은 Thread로 만들어야한다.(내부클래스를 만든다.)
	class EchoThread extends Thread {
		@Override
		public void run() {
			
		}
	}
	
	public static void main(String[] args) {
		
		new EchoServer();
	}

}
