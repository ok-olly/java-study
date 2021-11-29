package ch14;

public class ChatProtocol3 {
	
	public static final String ID = "ID";
	//(Client -> Server) ID:aaa
	//(Server -> Client) CHATLIST:aaa;bbb;ccc;ddd;
	
	public static final String CHAT = "CHAT";
	//(Client -> Server) CHAT:받는아이디;채팅메세지내용 ex)CHAT:bbb;밥먹자
	//(Server -> Client) CHAT:보내는아이디;채팅메세지내용 ex)CHAT:aaa;밥먹자
	
	public static final String CHATALL = "CHATALL";
	//(Client -> Server) CHATALL:채팅메세지내용
	//(Server -> Client) CHATALL:[보내는아이디]채팅메세지내용
	
	public static final String MESSAGE = "MESSAGE";
	//(Client -> Server) MESSAGE:받는아이디;쪽지내용 ex)MESSAGE:bbb;밥먹자
	//(Server -> Client) MESSGAE:보내는아이디;쪽지내용 ex)MESSAGE:aaa;밥먹자

	public static final String CHATLIST = "CHATLIST";
	//(Server -> Client) CHATLIST:aaa;bbb;ccc;ddd;
}
