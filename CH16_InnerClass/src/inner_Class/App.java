package inner_Class;

public class App implements Runnable {
	
	private String name = "��Ű���콺";
	
	public static void main(String[] args) {
		new App().start();

	}
	
	private void start() {
		//activate �޼ҵ� ������
		//1 App Ŭ������ Runnable ����
		activate(this);
		//2 �͸�Ŭ����
		activate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
		//3 �̳�Ŭ����
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		}
		activate(new Runner1());
		
	}
	public void activate(Runnable runnable) {
		runnable.run();
	}
	
	public void run() {
		System.out.println(name);
	}

}
