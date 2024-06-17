package ex18lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Ex06Define4Function {

	public static void main(String[] args) {
		/*
		 * Function<T,E> : 매개변수와 반환값을 둘 다 가지고있는 apply() 
		 * 추상 매서드가 정의되어있다. 개발자가 가장 많이 쓰는 함수형 인터페이스.
		 * 
		 * interface Function<T,E> {
		 * 		E apply(T, t);
		 * }
		 */
		
		/*
		 * 매개변수는 String, 반환값은 Integer 타입으로 람다식 정의.
		 * 문자열의 길이 반환.
		 */
		Function<String, Integer> func = (String s) -> {
			return s.length();
		};
		System.out.println("Lambda 문자열 길이 = " + func.apply("Lambda"));
		// Human 인스턴스 생성
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		
		//List 에 저장한다. 단 참조만 할 수 있는 형태이다.
		List<Human> list = Arrays.asList(p1,p2,p3,p4);
		
		//Human 인스턴스를 받은 후 점수(Score)를 반환하는 람다식 정의
		Function<Human, Integer> getFunction = (Human h) -> {
			return h.getScore();
		};
		int score = getFunction.apply(p1);
		System.out.println("p1의 점수" + score);
		
		/*
		 * foreach문을 통해 컬렉션 전체를 반복하여 점수를 출력한다.
		 */
		
		System.out.println("list에 저장된 객체의 점수 출력");
		for(Human h : list) {
			System.out.println(h.getName() + "의 점수 :" + getFunction.apply(h));
		}

	}

}
