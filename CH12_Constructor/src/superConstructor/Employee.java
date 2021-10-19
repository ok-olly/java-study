package superConstructor;

public class Employee extends Person {

	public Employee() {
		//super();
		//ㄴ Person의 생성자가 생략됨, 즉 Person 생성자 먼저 실행됨
		super("익명");
		System.out.println("Emp 생성자");
	}
}
