package application;

public class ForEachArray {

	public static void main(String[] args) {
		// for each �ݺ���
		int[] numbers = {2,4,6};
		String[] fruits = {"�ٳ���","���","����"};
		
		for(int x : numbers) {
			System.out.println(x);
		}
		
		for(String x : fruits) {
			System.out.println(x);
		}

	}

}
