package lottery;

import java.util.Random;

public class LuckyDip {
	
	private Random rd = new Random();
	private int Arr[] = new int[6];

	public void Go1() {
		// 번호 여섯 개 랜덤으로 추출
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = rd.nextInt(45 - 1 + 1) + 1;
			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (Arr[i] == Arr[j]) {
					i--;
					break;
				}
			}
		}
		// 추출된 번호 출력
		System.out.println("Here you go.");
		for(int i=0;i<Arr.length;i++) {
			System.out.print(Arr[i]+" ");
		}
		System.out.println();
		System.out.println("Good Luck!");
	}
}