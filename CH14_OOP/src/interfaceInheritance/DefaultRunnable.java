package interfaceInheritance;

//�������̽��� �������̽��� ���
public interface DefaultRunnable extends Runnable {
	default void displayDetails() { //default �޼ҵ�� �޼ҵ� �ڵ带 ����������
		System.out.println("ǥ���� ������ ����");
	}
}

