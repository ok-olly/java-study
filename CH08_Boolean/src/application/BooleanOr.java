package application;

public class BooleanOr {

	public static void main(String[] args) {
		// AND OR ���ÿ� ���
		boolean isRaining = false; // �� ���°�?
		boolean mightRain = true; //�� �� ���� �ִ°�?
		boolean haveUmbrella = true; //����� �ִ°�?
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����!");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}
		
		boolean rainCheck = isRaining || mightRain; //�� ���ųʳ� �� ���� �ְų� �϶� ��
		
		if((rainCheck || mightRain) && haveUmbrella) {
			System.out.println("����� ����!");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}
	}

}
