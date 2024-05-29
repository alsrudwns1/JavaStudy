package ex05method;


import java.util.Scanner;

/*
 * 메서드(함수)의 규칙
 * 자바에서 main 메서드는 public static void 로 선언한다.
 * static 으로 선언된 매서드는 static으로 선언된 매서드만 호출 가능하다.
 * 매서드 호출 후 반환값은 호출한위치로 반환된다.이때 메서드는 메모리에서 삭제된다.
 * 반환값이 없는 void 매서드도 실행이 완료되면 호출한 위치로 실행의 흐름이 돌아온다.
 * 
 */

public class E01MethodBasic {
	
	/*
	 * 매서드1 : 반환값 o, 매개변수 o,
	 * 매개변수로 2개의 정수를 전달받아 합의 결과를 반환함.
	 * 반환값은 호출한 지점으로 반환됨
	 */
	public static int simpleFunc(int a, int b) 
	{
		int sum = a+b;
		return sum;
	}
	
	/*
	 * 매서드2 : 반환값 없음, 매개변수 없음
	 * 전달받은 값 없이 이름을 입력받은 후 nameprint 를 호출한다.
	 * 이와같이 반환값이 없는 경우 void를 명시한다.
	 */
	public static void menuPrint()
	{
		System.out.println("당신의 이름은?");
		Scanner scanner = new Scanner(System.in);
		// nextline 문자열 입력받을때 사용
		String name = scanner.nextLine();
		namePrint(name);
	}
	
	/*
	 * 매서드3 : 반환값 x, 매개변수 o
	 * 문자열을 인수로 전달받아 단순히 출력만 진행한다.
	 * 반환값이 없는 경우 실행 종료 시 호출지점으로 실행의 흐름이 이동.
	 */
	public static void namePrint(String n) 
	{
		System.out.println("제 이름은" +n + "입니다.");
	}

	//메인함수 = 프로그램 출발점. 직접 호출하지 않아도 자동호출되어 실행됨
	public static void main(String[] args) {
		/*
		 * 매서드 호출 시 함수의 원형을 그대로 기술한다.
		 * 매개변수의 갯수가 다르거나 타입이 틀리면 에러가 발생한다.
		 */
		// 반환값이 있는 매서드는 우측항 print()의 일부로 사용
		int result = simpleFunc(1,2);
		System.out.println("1과 2를 전달한 결과:" + result);
		System.out.println("10 과 20을 전달한 결과:" + simpleFunc(10, 20));
		// 반환값이 없는 매서드는 단독으로 사용
		menuPrint();
		
		//메인매서드의 종료는 프로그램의 종료로 이어짐
	}

}
