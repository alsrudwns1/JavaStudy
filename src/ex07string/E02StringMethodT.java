package ex07string;

public class E02StringMethodT {

	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		
		System.out.print("### 시나리오1 ### ");
		String num = "190419-3000000";
		System.out.print("7번째 문자 추출" + num.charAt(7));
		
		char gender = num.charAt(7);
		if(gender=='1' || gender=='3') {
			System.out.print("남자입니다.");
		}
		else if(gender=='2' || gender=='4') {
			System.out.print("여자입니다.");
		}
		else if(gender=='5' || gender=='6') {
			System.out.print("외국인입니다.");
		}
		else
			System.out.print("오류입니다.");
			


		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		System.out.print("### 시나리오2 ### ");
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
		
		System.out.println("하이픈 위치 찾기 =" + num.indexOf("-")+ 1);
		
		int genderIndex = num.charAt(num.indexOf("-") + 1);
		
		if(genderIndex == '1'|| genderIndex == '3') {
			System.out.println("남자입니다");
			
		} else if (genderIndex == '2' || genderIndex == '4') {
			System.out.println("여자입니다");
			
		}
		else if (genderIndex == '5' || genderIndex == '6') {
			System.out.println("외국인입니다");
		}
		
		else {
			System.out.println("오류");
		}
		
		


		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		
		String filename = "my.file.images.jpg";
		
		//파일명 마지막 .의 위치를 검색
		int dotPoIdx = filename.lastIndexOf(".");
		
		//.의 위치 다음의 문자열부터 잘라내므로 +1 하여 처리
		String fileExt = filename.substring(dotPoIdx+1);
		
		System.out.println("파일확장자=" + fileExt);
		
		
		
		
	}

}

