package ex01start;

public class E02SystemOutPrintln {

	public static void main(String[] args) {
	/* println = 내용을 출력한 후 자동 줄바꿈
	 * 
	 * print = 줄바꿈 없음. 줄바꿈 필요하면 \n 추가
	 * 
	 * printf = 출력내용을 서식에 맞추어 출력한다. 자체적 줄바꿈 기능이 없으므로
	 * \n, %n 을 사용하여 줄바꿈한다. 변수 출력 서식문자에는 %d, %f 등이 있다.
	 * 줄바꿈을 위한 %n 은 printf 에서만 사용가능하다*/
		
		// 정수형 변수 선언한 뒤 100으로 초기화한다.
		int  num1 = 100;
		
		// 문자열과 정수형 변수를 + 기호를 통해 연결한 뒤 출력한다.
		System.out.println("num1=" + num1);
		System.out.print("num1=" +num1 +"\n");
		System.out.printf("num1=%d%n", num1);
		
		// 정수, 실수를 단순히 출력한다.
		System.out.println(7);
		System.out.println(3.14);
		
		/*
		 * print()문에서의 + 기호 역할
		 * 1. 숫자(정수 또는 실수) 끼리는 실제 덧셈 연산을 한다.
		 * 2. 문자열, 숫자 등 서로 자료형이 다른 데이터는 단순 연결하는 기능만 제공
		 */
		System.out.println(3+5);
		System.out.println(3.5+5.1);
		
		System.out.println("3+5=" +8);
		System.out.println(3.15+"는 실수");
		System.out.println("3+5" + "의 연산결과는" + 8);
		
		System.out.println("num1은" + num1 + "입니다");

	}

}
