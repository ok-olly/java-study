package getterSetter;

public class Person {
	// Ŭ���� �ȿ� ���� ������ �ν��Ͻ� ������ �ϰ� => ��ü ���� �� ��밡��(������)
	private String name;
	private int age;
	//get,set �޼ҵ�� ������ ����
	public void setName(String name) {
		this.name = name;
		//this�� ���� Ŭ������ ��ü�� ����Ŵ
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}
