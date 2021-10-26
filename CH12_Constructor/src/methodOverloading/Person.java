package methodOverloading;

public class Person {
	//메소드 오버로딩 => 메소드의 이름은 같지만 매개변수(parameter)가 다를 때
	public void greet() {
		System.out.println("Hello!");
	}
	
	public void greet(String name) {
		System.out.println("Hello! "+name);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("키가 크군요");
		}
		System.out.println("Hello! ");
	}
	
	public void greet(String name, int height) {
		if(height > 185) {
			System.out.println("키가 크군요");
		}
		System.out.println("Hello! "+name);
	}	
}
