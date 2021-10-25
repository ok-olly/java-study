package try_catch;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// try catch문을 사용해 예외처리
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine();
		
		int number = 0;
				
		try { //에러가 날 수 있는 코드를 try문 안에 넣는다.
			number = Integer.parseInt(line);
			System.out.println("여기는 실행되지 않습니다.");
		} catch (Exception e) { //try에서 에러 발생 시 catch문에서 처리한다.
			System.out.println("숫자 입력이 아닙니다.");
		}
		
		System.out.println("입력한 숫자는: "+number);
		

	}

}
