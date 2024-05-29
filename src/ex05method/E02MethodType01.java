package ex05method;
/*
 * 매서드, 함수
 * :객체지향 프로그래밍에서 행동 또는 동작을 의미
 * 즉 어떤 하나의 업무를 처리하기 위한 모듈(부속품)이라고 할수있다.
 * 매서드는 반드시 클래스 내부에 정의.
 * 매서드 내부에 또다른 매서드를 정의할 수 없음
 * 반환값이 없다면 void를 반드시 명시.
 * 매서드명은 변수명과 동일한 규칙으로 작성. 
 * 
 * 자바에서의 naming rule
 * - 클래스명: GoodMorning
 * 		=> 대문자로 시작하는 카멜표기법으로 작성
 * 
 * - 메서드 혹은 변수명: goodMorning
 * 		=> 소문자로 시작하는 카멜표기법. 매서드는 뒤에 ()가 붙음
 * 
 * - 상수명: GOOD_MORNING
 * 		=> 전체를 대문자로 작성. 연결단어는 _로 구분
 * 
 * - 패키지명: good.moring
 * 		=> 전체를 소문자로 작성. 연결단어는 .으로 구분
 */


/*
 * 매서드1 : 매개변수도 없고, 반환값도 없는 매서드
 * : 둘 다없는 형태의 매서드로 주로 메뉴출력 등의 단순 출력 기능으로 사용
 */
public class E02MethodType01 {
	
	static void menuPrint() {
		System.out.println("메뉴를 선택하시오");
		System.out.println("1. 열기, 2.계속하기, 3.종료");
		System.out.println("=================");
	}
	static void returnError() {
		int returnValue = 8;
		System.out.println("[return문 이전]");
		
		
		/*
		 * 매서드 중간에 return 을 기술하면 즉시 종료되며
		 * 그 아래에 있는 코드는 실행되지 않게 된다.
		 * 따라서 리턴은 반드시 조건문과 함께 쓰여야 한다.
		 * 매서드의 마지막 라인에 기술한다면 조건문 없어도 괜찮다.
		 */
		
		//return;
		
		// return 문이 중간에 있으려면 조건부로 기술해야 한다.
		if(returnValue%2==0) {
			System.out.println(returnValue + "는 짝수");
			//매서드에서 return은 종료를 의미한다.
			return;
		}
		
		System.out.println(returnValue + "는 홀수");
		System.out.println("[return문 이후]");
	}

	public static void main(String[] args) {
		menuPrint();
		returnError();

	}

}
