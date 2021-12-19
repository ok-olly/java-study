package lottery;

public class App {

	public static void main(String[] args) {
		// 로또 번호 추첨기 시작
		Preferences pre = new Preferences();

		System.out.println("+----------------------------+");
		System.out.println("|                            |");
		System.out.println("|       Play a Lottery       |");
		System.out.println("|                            |");
		System.out.println("+----------------------------+");
		
		pre.Set();
	}

}
