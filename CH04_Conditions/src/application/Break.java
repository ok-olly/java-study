package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 빠져나오는 명령어 break;
		int count = 0;
		
		while(true) {
			System.out.println("Hello "+count);
			
			if(count == 5) break; //명령문이 하나밖에 없을 때는 중괄호 생략 가능
			
			System.out.println("How are you");
			count = count + 1; //count++
		}
		
		System.out.println("프로그램 종료");

	}

}
