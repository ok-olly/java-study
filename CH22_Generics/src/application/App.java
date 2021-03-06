package application;

import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Creature;

public class App {

	public static void main(String[] args) {
		//제네릭 타입 클래스는 객체를 만들 때 타입을 지정한다.
		Wrapper<Cat> wrapper = new Wrapper<>(); //wrapper 클래스의 객체를 만듦
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다"); //고양이 마틸다 개체를 생성
		Creature creature = new Creature("생물");
		
		wrapper.set(cat); //wrapper 객체의 set 메소드에 마틸다 입력
		wrapper2.set(creature);
		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);
		
		r1.feed();
		r2.feed();
	}
}