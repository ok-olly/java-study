package constructors;

public class Person {
	//����
	private String name;
	private double height;
	
	//������
	public Person() {
		//�⺻ ������(�Ű����� ����)�� ��������
		System.out.println("�� ����� ����!");
	}
	
	//get set �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
}
