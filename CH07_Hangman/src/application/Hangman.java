package application;

public class Hangman {
	
	private boolean running = false;
	private RandomWord word = new RandomWord();

	public void run() {
		// ���� ����
		
		do {
			displayWord(); //ȭ�鿡 �ܾ�ǥ��
			getUserInput(); //�Է¹���
			checkUserInput(); //�´��� üũ �� ������ running = false
		} while (running);
		
	}

	private void checkUserInput() {
		System.out.println("üũ");
		
	}

	private void getUserInput() {
		System.out.println("�ܾ���߱�");
	}

	private void displayWord() {
		//���� �ܾ� ���		
		System.out.println(word.toString());
	}

}
