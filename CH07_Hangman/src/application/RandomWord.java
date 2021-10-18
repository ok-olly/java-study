package application;

import java.util.Random;

public class RandomWord {
	private String books = "expression awareness advertising importance football committee recognition ambition birthday television environment depression solution director internet security midnight situation reputation computer";
	private String[] words = books.split(" ");
	
	private String selectWord; //������ �ܾ�
	private Random rand = new Random(); //���� ��ü�� ����
	private char[] characters;
	
	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)]; // �������� �ܾ ����
		characters = new char[selectWord.length()]; //���� �迭 ���� ����
	}
	
	public String toString() {
		
		//characters[3] = 'X';
		
		StringBuilder sb = new StringBuilder();
		
		for(char c: characters) {
			sb.append(c=='\u0000'? '_' : c);
			sb.append(' ');
		}
		
		//System.out.println(selectWord);
		return sb.toString();
	}
	
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}

	public void addGuess(char c) {
		// ����ڰ� �Է��� �� ���ڸ� ���õ� �ܾ�� ������ �ִ��� Ȯ��
		// ������ characters�� �ε��� ��ġ�� �Է�.
		for(int i=0;i < selectWord.length();i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}

	public boolean isCompleted() { // �� ����°�?
		for(char c : characters) {
			if(c=='\u0000') {
				return false; //���� ĳ������ �迭�� �� ���� ö�ڰ� ����
			}
		}
		return true; //�� ������
	}
	
}
