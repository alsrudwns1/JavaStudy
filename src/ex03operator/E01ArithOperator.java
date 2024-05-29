package ex03operator;

public class E01ArithOperator {

	public static void main(String[] args) {
		
		int num1= 7;
		int num2 = 3;
		
		System.out.println("덧셈:" +(num1+num2));
		System.out.println("뺄셈:" +(num1-num2));
		System.out.println("곱셈:" +(num1*num2));
		
		/*
		 * 나눗셈 연산이라 할지라도 정수와 정수의 연산 결과는 정수가 나온다.
		 * 실수 결과를 얻기 위해서는 실수와의 연산을 진행하거나 강제형변환 해야함.
		 */
		System.out.println("나눗셈(몫):" +(num1/num2));
		System.out.println("나눗셈(나머지):" +(num1%num2));
		
		int result = 3 * 2 + 5 % 2 - 6 / 3 * 5;
		System.out.println(" 결과는? " + result);

	}

}
