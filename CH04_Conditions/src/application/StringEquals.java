package application;

public class StringEquals {

	public static void main(String[] args) {
		// ���ڿ��� ������ ��
		String text1 = "apple";
		String text2 = "orange";
		
		System.out.printf("�� ���� ���ڿ� ���� : %b\n", text1==text2);
		System.out.println("�� ���� ���ڿ� ��ġ : "+text1.equals(text2));

	}

}
