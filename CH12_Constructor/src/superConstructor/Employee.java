package superConstructor;

public class Employee extends Person {

	public Employee() {
		//super();
		//�� Person�� �����ڰ� ������, �� Person ������ ���� �����
		super("�͸�");
		System.out.println("Emp ������");
	}
}
