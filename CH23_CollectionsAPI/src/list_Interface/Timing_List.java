package list_Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_List {

	public static void main(String[] args) {
		// 어레이와 링크드 리스트의 실행시간 비교
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkdedList = new LinkedList<>();
		//클래스 가져올 때 단축키 Ctrl+Spcae, 여러 개 한꺼번에 가져올 때 Ctrl+Shift+o
		
		long duration = timeOperation(arrayList);
		
		System.out.println("측정 시간 : " + duration);
		//그냥 순서대로 추가할 때 어레이 리스트가 링크드보다 5배 이상 빠르다.
		//특정 위치에 추가 또는 제거할 때 링크드 리스트가 10배는 빠르다.
	}

	private static long timeOperation(List<Integer> list) {
		// 입력받은 리스트로 실행시간을 측정해서 리턴
		long start = System.currentTimeMillis(); //현재 시간을 1/1000초 단위로 측정
		
		for(int i=0; i<1000000; i++) {
			list.add(0, i); //백만번 입력
		}
		return System.currentTimeMillis() - start; //작업이 끝난 다음에 측정시간-이전시간 
	}

}
