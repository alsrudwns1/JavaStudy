package ex16exception;

import java.util.Scanner;

public class Ex02PreDefineException2 {

	public static void main(String[] args) {
		
		System.out.println("###");
		Scanner sc = new Scanner(System.in);
		try {
			/*
			 * 입력 시 정수가 아닌 문자 혹은 문자열을 입력하면
			 * 정수로 변환이 불가능하므로 예외 발생 (ex: 10세)
			 */
			System.out.println("나이를 입력하시오");
			String strAge = sc.nextLine();
			int ageAfter10 = Integer.parseInt(strAge) + 10;
			System.out.println("당신의 10년뒤 나이는:" + ageAfter10);
		}
		catch (NumberFormatException e) {
			System.out.println("나이는 숫자로만 입력해야 합니다");
			System.out.println("예외 메세지:" + e.getMessage());
			e.printStackTrace();
		}

	}

}
