package method_innerClass;

public class App {
	private String name;
	
	public App() {
		// �⺻ ������
		name = "�����ں���";
	}
	
	public String getName() {
		return name;
	}
	
	public void run() {
		//System.out.println(name); //�̸��� ���
		class Printer {
			public void print() {
				System.out.println(name);
				//���� Ŭ�������� �ܺ�Ŭ������ ���� ��밡��
			}
		}
		//Printer p = new Printer();
		//p.print();		
		new Printer().print();
	}
	
	public static void main(String[] args) {
		// �޼ҵ� ���� Ŭ����
		App app = new App();
		app.run();
	}

}
