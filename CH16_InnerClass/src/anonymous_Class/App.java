package anonymous_Class;

public class App {
	private String name = "펭수";

	public static void main(String[] args) {
		new App().start();

	}
	private void start() {
		//System.out.println(name);
//		Runnable runner = new Runnable() { //익명클래스
//			public void run() {
//				System.out.println(name); //내부클래스로 외부클래스의 변수 사용
//			}
//		};
		
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}
	private void activate(Runnable runnable) {
		runnable.run(); //추상메소드 run을 실행
	}

}
