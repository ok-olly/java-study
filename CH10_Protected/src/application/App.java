package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		Fruit f1 = new Apple();
		//f1.id = �ٸ� ��Ű������ protected ���� �Ұ�
		System.out.println(f1);
		
		Fruit f2 = new Banana();
		System.out.println(f2);
	}

}
