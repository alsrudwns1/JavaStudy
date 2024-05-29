package ex03operator;

public class E06PrePostFixOperator {

	public static void main(String[] args) {
		
		/*
		 * 증감연산자: 변수를 +1 혹은 -1 한 결과를 반환한다. 주로 반복문에서 사용.
		 */
		
		int num1 = 7;
		int num2, num3;
		// 전위 증감: 연산자가 변수 앞에 있는 경우.
		// 변수의 값이 먼저 변경되며 변경된 값이 좌측항으로, 혹은 다른 코드에 반영
		num2 = ++num1;
		num3 = --num1;
		System.out.println("전위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n", num1, num2 ,num3);
		
		num1 = 7;
		//후위 증감: 연산자가 변수 뒤에 있는 경우
		// 변수의 값이 먼저 다른 코드에 반영된 다음 변수의 값이 변경됨
		num2 = num1++;
		num3 = num1--;
		
		System.out.println("후위증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2 ,num3);
	}

}
