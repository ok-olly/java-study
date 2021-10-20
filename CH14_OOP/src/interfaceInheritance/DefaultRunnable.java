package interfaceInheritance;

//인터페이스에 인터페이스를 상속
public interface DefaultRunnable extends Runnable {
	default void displayDetails() { //default 메소드는 메소드 코드를 만들어줘야함
		System.out.println("표시할 디테일 없음");
	}
}

