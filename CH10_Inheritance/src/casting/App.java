package casting;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new HouseCat();//������� ��ü
		cat1.vocal();
		cat1.hunt();
		
		//cat1.call();
		//Cat Ÿ���̱� ������ ����� �޼ҵ常 ��밡��(�������̵� ��)
		
		HouseCat cat2 = (HouseCat)cat1;
		cat2.call(); //������ ����� ������� ��ü�� call�޼ҵ� ����
	}

}
