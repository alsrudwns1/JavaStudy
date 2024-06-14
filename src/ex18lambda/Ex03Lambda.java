package ex18lambda;

/*
 * 3. 람다식으로 구현하기
 * : 객체지향 프로그래밍에서는 매서드를 선언하기 위해 반드시 클래스를
 * 정의해야 한다. 이러한 불편함 때문에 항수형 프로그래밍(Functional Programming)의
 * 장점이 대두되었고, 이런 자바의 단점을 보완하기 위해 JDK 1.8부터 람다식을
 * 지원하게 되었다.
 */


//람다식 정의를 위한 인터페이스 정의
interface ISchool3 {
	void studyLambda(String str);
}

public class Ex03Lambda {

	public static void main(String[] args) {
		/*
		 * 2번 예제의 익명클래스를 다음과 같은 람다식으로 표현할 수 있다.
		 * 1. 함수명을 제거한다. 어차피 부모 인터페이스로부터 오버라이딩 했으므로
		 * 동일한 이름인 것을 우리는 알고있다.
		 * 2. 람다식 임을 표현하기 위해 소괄호와 중괄호 사이 화살표를 삽입.
		 * 좌측의 부모참조변수가 우측의 자식영역을 참조한다는 개념으로 이해.
		 */
		
		//람다식 정의
		ISchool3 sch1 = (String str) -> {
			System.out.println(str + "을 드디어 써보네요");
		};
		//추상메서드명을 통해 람다식 호출
		sch1.studyLambda("람다식");
		
		/*
		 * 앞의 람다식을 한번더 줄이면 다음과 같이 표현 가능.
		 * ISchool3 인터페이스의 추상메서드를 통해 매개변수의 타입을 유추할 수
		 * 있으므로 string 제거 가능. 또한 실행문이 하나인 경우 중괄호도 생략가능
		 */
		
		ISchool3 sch2 = str -> System.out.println(str + "간단함");
		sch2.studyLambda("람다식");
	}
}
