package lottery;

import java.util.Random;
import java.util.Scanner;

public class Hybrid {

	Scanner sc = new Scanner(System.in);
	private Random rd = new Random();

	int hybridNumber;
	int hybridArr[] = new int[6];

	public void Go3() {
		// 먼저 사용자가 원하는 만큼 번호 선택하고 나머지는 랜덤 추출
		for (int i = 0; i < hybridArr.length; i++) {
			System.out.println((i + 1) + "번 째 값을 입력하세요: ");
			System.out.println("(0을 입력하면 나머지 숫자는 반자동으로 뽑아드립니다.)");
			System.out.print(">>");
			hybridNumber = sc.nextInt();
			// 1부터 45사이의 숫자를 입력한 경우
			if (1 <= hybridNumber && hybridNumber <= 45) {
				hybridArr[i] = hybridNumber;
				// 중복 체거
				for (int j = 0; j < i; j++) {
					if (hybridArr[j] == hybridNumber) {
						System.out.println("이미 입력한 번호입니다. 다른 번호를 입력하세요.");
						i--;
						break;
					}
				}

			}
			// 번호 입력을 끝낸 후 부족한 번호는 랜덤 추출
			else if (hybridNumber == 0) {
				for (int j = i; j < hybridArr.length; j++) {
					hybridArr[j] = rd.nextInt(45 - (1 + 1)) + 1;
				}
				// 중복 제거
				for (int k = i; k < 6; k++) {
					for (int h = 0; h < 6;) {
						if (k != h && hybridArr[k] == hybridArr[h]) {
							hybridArr[k] = rd.nextInt(45 - (1 + 1))+1;
							h = 0;
						} else {
							h++;
						}
					}
				}
				i = 6;
			}
			// 범위 이외의 숫자를 입력한 경우
			else {
				System.out.println("1~45 사이의 숫자만 입력할 수 있습니다. 다시 입력하세요.");
				i--;
			}
		}
		// 추출된 번호 출력
		System.out.println("Here you go.");
		for (int i = 0; i < hybridArr.length; i++) {
			System.out.print(hybridArr[i] + " ");
		}
		System.out.println();
		System.out.println("Good Luck!");
	}
}
