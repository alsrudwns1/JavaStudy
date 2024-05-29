package ex04controlstatement;

import java.io.IOException;

/*
 * if 문 형식
 * if(조건문) {
 * 			실행문;
 * }
 * 
 * - if문의 조건문은 반드시 비교식 혹은 논리식
 * - 결과값이 boolean 타입으로 참 거짓 둘중 하나를 반환해야함
 * - 실행할 문장이 하나라면 중괄호 생략가능
 */

public class E01If01 {

	public static void main(String[] args) throws IOException
	{
		int num = 10;
		
		//if(num%2) {
		//	System.out.println("잘못된 조건식");
		//}
		//if(num) {
		//	System.out.println("잘못된 조건식");
		//}
		
		//if문의 조건은 아래와 같이 boolean 값을 반환하는 조건식이어야함
		
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다" , num);
		}
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이며 10보다 크거나같다" , num);
		}
		
		if(true) {
			System.out.printf("무조건 실행되는 if문");
		}
		
		if(num%2 !=0);
		{
			System.out.printf("%d는 홀수입니다" , num);
		}
		
		if(num%2 == 0)
			System.out.printf("\n" + num + "는 짝수입니다");
		
		if(num%2 != 0) {
			System.out.printf("num은" + num + "입니다" );
			System.out.printf(num + "은 홀수입니다.");
		}
		
		/*
		시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해서 작성하시오.
		참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를 정수형으로 반환하는 메서드. 두글자 이상 입력하더라도 첫번째 문자만 입력된다.  
		 */
		
		System.out.println("하나의 문자를 입력하세요");
		int asciiCode = System.in.read();
		System.out.println("입력한 문자는:"+asciiCode);
		
		/*
		 * 아스키코드를 알고있을때의구현방법. 문자 0과 9가 아스키코드 48, 57에 해당하므로
		 * 구간내에 있는지 알 수 있다.
		 */
		if(asciiCode >= 48 && asciiCode<=57) {
			System.out.println("입력한 문자는 숫자입니다");
		}
		else {
			System.out.println("숫자가 아닙니다");
		}
		
		/*
		 * 아스키코드 모를때의 구현방법. 문자 0과 9는 메모리에 저장 시 아스키코드로 변환되므로
		 * 아래와 같은 조건으로도 확인 가능하다.
		 */
		if(asciiCode >= '0' && asciiCode<=9) {
			System.out.println("입력한 문자는 숫자입니다[1]");
		}
		else {
			System.out.println("숫자가 아닙니다[1]");
		}
		
		

	}

}
