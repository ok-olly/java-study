package example_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
	public static void main(String[] args) {
		// key:Person객체, value:true or false(원격수업 여부)
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		//맵에서 키값으로 중복을 결정하는데 Person 클래스에서 equals메소드를 이름으로 수정하면 이름이 같을 때 중복이 된다.
		inputMap(people1);
		displayMap(people1);
		
		inputMap(people2);
		displayMap(people2);
		
		//트리맵은 정렬을 해야하는데 키값인 Person객체가 비교할 수 있는 메소드가 없다. => comparable 인터페이스 추가
		inputMap(people3);
		displayMap(people3);
		
	}

	private static void displayMap(Map<Person, Boolean> map) {
		// 맵에 있는 k, v값을 출력
		map.forEach((k,v) -> System.out.println(k+": "+v));
		System.out.println(); //한줄 띄우기
	}

	private static void inputMap(Map<Person, Boolean> map) {
		// map에 키와 값을 입력
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), true);
	}

}
