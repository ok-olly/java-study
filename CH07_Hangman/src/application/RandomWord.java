package application;

import java.util.Random;

public class RandomWord {
	private String books = "expression awareness advertising importance football committee recognition ambition birthday television environment depression solution director internet security midnight situation reputation computer";
	private String[] words = books.split(" ");
	
	private String selectWord; //������ �ܾ�
	private Random rand = new Random(); //���� ��ü�� ����
	
	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)]; // �������� �ܾ ����
	}
	
	public String toString() {
		return selectWord;
	}
	
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
	
}
