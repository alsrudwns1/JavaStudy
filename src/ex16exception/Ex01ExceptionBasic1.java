package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args) {
	
		
		/*
		 * Syntax 에러(구문에러)
		 * : 실행 자체가 되지 않는 코드로 오류를 수정해야만 정상 실행 가능
		 * 즉 코드에 문법적인 오류가 발생되었음을 의미함
		 */
//		Int number = 10; -> int 를 Int 로 표기함
//		if(true);
//		{}
//		else -> if문이 세미콜론으로 종료되어 의미없는 else문이 됨
//		{}
		
		//위 코드를 정상적으로 수정하면 아래와 같아진다.
		int number = 10;
		if(true) {
			System.out.println("참이다");
		} else {
			System.out.println("거짓이다");
		}
		
		
		/*
		 * 외부자원을 사용할 때 발생되는 예외 처리 방법
		 * 1] 예외가 발생한 지점을 try ~ catch 문으로 직접 감싸서 처리.
		 * 
		 * 2] "예외던지기"를 수행한다.
		 * main 메서드에 throws IOException 을 기술하면 해당 매서드 내에서
		 * 발생되는 예외를 프로그램 외부로 던지기 할 수 있다.
		 * 여기서 던지기의 의미는 예외를 처리하지 않고 무시하겠단 뜻.
		 */
		System.out.println("문자 1개 입력");
		try
		{
			int iChar = System.in.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
