package method;

public class Gamble {

	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("ȹ�� �ݾ�: $%.2f(%.0f��",dollar,won);
	}
	
	private static int dice() {
		//return Math.random();
	}
	
	private static double exchange(double dollar) {
		return 1082.25108/dollar;
	}

	
	
	
	

}
