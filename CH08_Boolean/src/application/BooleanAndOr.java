package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// || or �� ������
		boolean isRaining = false; // �� ���°�?
		boolean mightRain = true; //�� �� ���� �ִ°�?
		boolean takeUmbrella = false; //����� ��������?
		
		takeUmbrella = isRaining || mightRain; //�� ���ų� �Ǵ� �� ���� �ְų� �ϳ��� ���̸� ��
		
		System.out.println(takeUmbrella);
		

	}

}
