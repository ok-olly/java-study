package application;

public class Break {

	public static void main(String[] args) {
		// �ݺ��� �ȿ��� ���������� ��ɾ� break;
		int count = 0;
		
		while(true) {
			System.out.println("Hello "+count);
			
			if(count == 5) break; //��ɹ��� �ϳ��ۿ� ���� ���� �߰�ȣ ���� ����
			
			System.out.println("How are you");
			count = count + 1; //count++
		}
		
		System.out.println("���α׷� ����");

	}

}
