package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// arraylist와 linkedlist는 둘다 list interface를 구현함
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(7);
		numbers.add(8);
		numbers.add(4);
		
		displayList(numbers); //리스트 내용을 출력하는 메소드
	}

	private static void displayList(List<Integer> list) {
		// 매개변수로 리스트 객체를 입력받아 리스트 내용을 전부 출력
		list.forEach(System.out::println);
		
	}

}
