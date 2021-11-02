package example;

public class Split_String {
	public static void main(String[] args) {
		// 문자열.split(" ") => 문자열을 공백(space)으로 쪼개서 배열로 리턴
		String text1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "홍남기 부총리 겸 기획재정부장관은 현지시간 1일 영국 런던에서 한국경제설명회를 개최하고, MSCI 선진국지수 편입을 재추친하겠다고 밝혔다.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //정규표현식[], ^는 시작문자, +는 그 다음문자도 같다는 뜻
		String[] words = text2.split("[^가-힣]+");
		
		for(String w : words) {
			
			if(w.length() < 2) continue; //한 철자 이하는 빼기
			
			System.out.println(w.toLowerCase()); //전부 소문자로 출력
		}
	}
}
