package application;

public class For {

	public static void main(String[] args) {
		// for �ݺ��� for(�ʱⰪ;����;����){ ��ɹ�; }
		
		for(int i=0; i<3; i++) {
			System.out.println("i: "+i);
		}
		
		int total = 0;
		for(int i=1; i<=100; i++) {
			total += i;
		}
		System.out.println(total);
		
		/* ������ �ּ�
		for(;;) {
			System.out.println("���ѹݺ�");
		}
		*/

	}

}
