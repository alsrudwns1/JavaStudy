package ex02variable;

public class E04StringType {

	public static void main(String[] args) {
		
		/*
		 * String 클래스: 참조형 변수로서 기본자료형이 아닌 클래스로 문자열을 저장, 조작하는 기능을 가짐
		 * 자바에선 문자열 표현 시 ""으로 감싸면 되고, 연결 시 + 기호 씀.
		 */
		
		int number;
		number = 99;
		
		/*
		 * 클래스를 통해 생성한 참조형 변수와 기본 자료형 사이에선 형변환 불가
		 * 서로 사용하는 메모리 공간이 다르기 때문.
		 * - 기본 자료형: Stack(스택)영역을 사용
		 * - 참조형(클래스) 변수:Heap(힙)영역 사용
		 */
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		//String + int => 단순 연결되서 출력댐
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		//String 은 클래스이므로 new를 사용해서 변수를 생성할 수 있다.
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		
		//String 변수는 주로 ""를 통해 생성함
		String stringBasic = "클래스지만";
		String plusString="기본자료형처럼씀";
		
		//+기호는ㄴ 문자열을 연결하는 기능으로 사용된다.
		System.out.println(stringBasic +"" + plusString);
		
		// 문자열+정수: 우선순위가 없다면 일반적으로 문자열ㄹ ㅗ출력됨
		// 단 산술연산의 결과를 출력하고 싶다면 아래와 같이 소괄호로 묶어 우선순위에 대한 변화를 주면 됨
		int kor = 100, eng=99, math=98;
		
		//1009998. 이어붙힌 형태로 출력
		System.out.println("총점:"+kor+eng+math);
		
		//덧셈 계산된 결과인 297출력
		System.out.println("총점:"+(kor+eng+math));

	}

}
