package casting;

public class HouseCat extends Cat {
	//���� vocal()�޼ҵ带 �������̵�(���� �޼ҵ忡 �ٸ� ������ �ۼ�)
	@Override
	public void vocal() {
		System.out.println("�̾߿�");
	}
	//��������� �޼ҵ�
	public void call() {
		System.out.println("���縦 �θ��ϴ�.");
	}
}
