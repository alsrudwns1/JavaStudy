package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		
		String num = "190419-3000000";
		
		System.out.print("7번째 문자 추출" + num.charAt(7));
		
		System.out.println(num.charAt(7) == '3' ? "남자" : "여자" + "입니다");
		
		

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		String email = "hong@daum.net";
		
		if(email.contains("@") && email.contains(".")) {
			System.out.print("이메일형식 입니다");
		}
		else 
			System.out.print("이메일형식이 아닙니다");
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		
		
		if(num.charAt((num.indexOf("-")+1)) == '3') {
			System.out.print("남자입니다");
			
		} else if (num.charAt((num.indexOf("-")+1)) == '4') {
			System.out.print("여자입니다");
			
		}
		else {
			System.out.print("오류");
		}
		


		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		
		String name = "my.file.imagess.jpg";
		String namechar = name.substring(name.lastIndexOf(".")+1);
		
		System.out.println(namechar);
		


	}

}
