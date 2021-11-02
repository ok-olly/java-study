package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {
	public static void main(String[] args) throws IOException {
		// 책 파일을 불러와서 단어로 정렬해서 출력
		File wordsBook = new File("book.txt");
		File wordsBook2 = new File("book2.txt");
		
		System.out.println(wordsBook.exists());
		System.out.println(wordsBook2.exists());
		
		TreeSet<String> booklist = loadWords(wordsBook);
		TreeSet<String> book2list = loadWords(wordsBook2);
		
		System.out.println(booklist.size());
		System.out.println(book2list.size());
		
		displayWords(booklist);
		
	}

	private static void displayWords(TreeSet<String> list) {
		// 트리셋을 입력받아 그 안의 단어들을 출력한다.
		int count = 0;
		for(String w : list) {
			if(w.length() >= 6) {
			System.out.printf("%-15s \t",w); //왼쪽 기준 15칸을 주는거(오른쪽으로 할거면 그냥 양수15)
			count++;
			if(count == 6) {
				System.out.println();
				count = 0;
			}
			
			}
		}
	}

	private static TreeSet<String> loadWords(File file) throws IOException {
		// 파일을 입력하면 읽어서 단어들을 트리셋으로 리턴
		TreeSet<String> wordSet = new TreeSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String line = null;
			while((line = br.readLine()) != null) { //파일을 한 줄씩 읽다가 마지막 글을 일고나면 종료
				String[] words = line.split("[^a-zA-Z]+"); //영문 단어 배열로 리턴
				
				for(String w : words) {
					if(w.length() < 2) continue; //단어가 철자 하나 이하면 제외
					wordSet.add(w.toLowerCase()); //단어들을 소문자로 리스트에 추가
				}
			}
		}
		
		return wordSet;
	}

}
