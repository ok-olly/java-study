package application;

public class App {
	public static void main(String[] args) {
		// ����� Ŭ���� �ҷ�����
		Cat cat1 = new Cat("��ƿ��"); //count++
		Cat cat2 = new Cat("���̾�"); //count++
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		//����ƽ ������ ��ü�� ������� Ŭ������.���� �� ����Ѵ�. ��ü ������ �ʿ� ����
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(cat2.getCount());
		System.out.println(cat2.getCount());
		
		Cat cat3 = new Cat("�����"); //count++
		System.out.println(cat2.getCount());
	}

}
