package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String�� ���� �ڷ���, ���� ������ �ּҰ��� ���´�.
		String text = null; //���� ���� ������ �ּҰ��� ����
		//text = new String("��ο�!");
		text = "��ο�!";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; // 3���� ���ڿ� �迭���� ����
		System.out.println(texts); //�迭�� �ּҰ��� ���
		
		texts[0] = new String("����");
		texts[1] = "�ȳ�";
		texts[2] = "�¹���";
		
		for(String word : texts) {
			System.out.println(word);
		}

	}

}
