package application;

public class Hangman {
	
	private boolean running = false;
	private RandomWord word = new RandomWord();

	public void run() {
		// 게임 시작
		
		do {
			displayWord(); //화면에 단어표시
			getUserInput(); //입력받음
			checkUserInput(); //맞는지 체크 다 맞으면 running = false
		} while (running);
		
	}

	private void checkUserInput() {
		System.out.println("체크");
		
	}

	private void getUserInput() {
		System.out.println("단어맞추기");
	}

	private void displayWord() {
		//랜덤 단어 출력		
		System.out.println(word.toString());
	}

}
