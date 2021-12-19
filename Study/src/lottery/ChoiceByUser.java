package lottery;

import java.util.Scanner;

public class ChoiceByUser {
	Scanner sc = new Scanner(System.in);

	int nonAutoNumber;
	int nonAutoArr[] = new int[6];

	public void Go2() {
		// 사용자가 번호 여섯 개 입력
		for (int i = 0; i < nonAutoArr.length; i++) {
			System.out.print((i + 1) + "번 째 값을 입력하세요. >>");
			nonAutoNumber = sc.nextInt();
			// 1부터 45사이의 숫자를 입력한 경우
			if (1 <= nonAutoNumber && nonAutoNumber <= 45) {
				nonAutoArr[i] = nonAutoNumber;
				// 중복 제거
				for (int j = 0; j < i; j++) {
					if (nonAutoArr[j] == nonAutoNumber) {
						System.out.println("이미 입력한 번호입니다. 다른 번호를 입력하세요.");
						i--;
						break;
					}
				}
			}
			// 범위 이외의 숫자를 입력한 경우
			else {
				System.out.println("1에서 45사이의 숫자만 입력할 수 있습니다. 다시 입력하세요.");
				i--;
			}
		}
		// 추출된 번호 출력
		System.out.println("Here you go.");
		for (int i = 0; i < nonAutoArr.length; i++) {
			System.out.print(nonAutoArr[i] + " ");
		}
		System.out.println();
		System.out.println("Good Luck!");
	}
}
