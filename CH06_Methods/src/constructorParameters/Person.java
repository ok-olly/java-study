package constructorParameters;

public class Person {
	//����
	private String name;
	private double height;
	
	public Person() {
		// �⺻ ������
		name = "�ſ��̻�";
		height = 0.0;
		System.out.println("�� ����� ����!");
	}
	
	//������(�̸�, Ű) 
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
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
	
	public String toString() {
		return "�̸�: "+name+" Ű: "+height;
	}
	
}
