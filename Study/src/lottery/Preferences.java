package lottery;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Preferences {

	Scanner sc = new Scanner(System.in);
	LuckyDip auto = new LuckyDip();
	ChoiceByUser nonAuto = new ChoiceByUser();
	Hybrid hybrid = new Hybrid();

	public void Set() {
		// 시작 전 여기서 어떤 방법으로 진행할지 선택
		System.out.println("1. 자동 : 랜덤으로 번호 생성");
		System.out.println("2. 수동 : 사용자가 번호 직접 고르기");
		System.out.println("3. 반자동 : 일부 번호는 사용자가 직접 고르고 나머지는 랜덤으로 생성");
		System.out.println();
		System.out.print("원하는 방법을 숫자로 입력하세요 >> ");

		try {
			int option = sc.nextInt();
			// 1. 자동
			if (option == 1) {
				System.out.println("1. 자동 : 랜덤으로 번호 생성");
				auto.Go1();
			}
			// 2. 수동
			else if (option == 2) {
				System.out.println("2. 수동 : 사용자가 번호 직접 고르기");
				System.out.println("1에서 45사이의 숫자만 입력할 수 있습니다.");
				nonAuto.Go2();
			}
			// 3. 반자동
			else if (option == 3) {
				System.out.println("3. 반자동 : 일부 번호는 사용자가 직접 고르고 나머지는 랜덤으로 생성");
				System.out.println("1에서 45사이의 숫자만 입력할 수 있습니다.");				
				hybrid.Go3();
			}
			// 1,2,3이 아닌 다른 숫자를 입력한 경우
			else {
				System.out.println("잘못된 입력!");
			}
			// 숫자가 아닌 다른 키를 입력한 경우
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력!");
		}
	}
}
