package polymorphism;

public class App {
	public static void main(String[] args) {
		// ��ü�� ��ӹ��� CatŸ������ ����
		/*Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();

		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();

		Cat cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();*/

		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		//cats[0] = new HouseCat()
		//cats[1] = new RoadCat()
		//cats[2] = new TigerCat()
		/*cats[0].vocal();
		cats[0].hunt();
		
		cats[1].vocal();
		cats[1].hunt();
		
		cats[2].vocal();
		cats[2].hunt();*/
		
		//for �ݺ���
		for(int i=0; i< cats.length;i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		//for each �ݺ���
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		//�� ��ȯ casting
		//�⺻Ÿ��
		//int a = 1.2345;
		int b = (int)1.2345;
		System.out.println(b);
		
		//����Ÿ�� : �⺻�� ������ Ŭ���� Ÿ�� ��
		Cat cat1 = new HouseCat(); //��ĳ����
		
		//�ٿ� ĳ���� (Ÿ���� �ٽ� ���� Ŭ������ ��ȯ) : (����Ŭ����) ���´�.
		HouseCat cat2 = (HouseCat)cat1;
		
		
	}

}
