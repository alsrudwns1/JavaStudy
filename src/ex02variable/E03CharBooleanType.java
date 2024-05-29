package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		/*
		 * char 형 = 하나의 문잘르 지정할 수 있는 자료값. 값 저장 시 ''으로 감싸 표현한다.
		 * "" 으로 감싸면 문자열로 인식하므로 String 으로 선언
		 */
		char ch1 = '가';
		String chStr = "가나다라";
		System.out.println("ch1=" +ch1);
		System.out.println("chStr=" + chStr);
		
		/*
		 * 아스키코드 : 1byte 로 표현할 수 있는 문자로 영문, 숫자를 십진수로 정의한 것
		 * 유니코드: 1바이트로 표현할 수 없는 문자로 영문과 숫자를 제외한 모든 문자(한글 등)를 2바이트로 표현함.
		 * 보통 숫자가 크기 때문에 16진수로 표현함
		 */
		
		// 메모리에 65로 저장됨(A 의 아스키코드)
		char ch2 = 'A';
		// 정수형 변수 선언 및 초기화
		int num1 = 2;
		// 문자+정수 =>아스키코드로 저장되므로 연산가능
		int num2 = ch2 + num1;
		
		// 정수로 출력 시 67
		System.out.println("num2 =" + num2);
		// 정수로 출력 시 C
		System.out.println("(char)num2=" + (char)num2);
		
		
		// (char)(char + int => int) => char형으로 강제형변환
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=>" + ch3);
		System.out.println("ch3(아스키코드출력)=>" + (int)ch3);
		
		// ''d으로 감쌌으므로 문자1(아스키코드49)이 할당된다.
		char ch4 = '1';
		// 연산결과는 50이므로 이에 해당하는 문자 '2'가 된다. (아스키코드50)
		char ch4_1 = '1' +1;
		
		//문자 '2'와 정수 50이 출력
		System.out.println("ch4=" + ch4 + ", ch4_1=" +ch4_1 +",ch4_1=" +(int)ch4_1);
		
		/*
		 * boolean타입: true 혹은 false 두가지으 ㅣ값만 가질 수 있는 자료형으로
		 * 산술연산(+,-) 비교연산( < , > , = ) 에서는 사용할 수 없고 논리연산에서만 사용 가능
		 */
		
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1=" + bn1 +", bn2="+bn2);
		
		
		/*
		 * && (논리 and) = 양쪽 모두 참일 때만 참 반환
		 * || (논리 or) = 한쪽이라도 참이면 참 반환
		 */
		
		// T && F = False 반환
		boolean bn3 = bn1 && bn2;
		System.out.println("b3(And)=" + bn3);
		
		// T || F = True 반환
		bn3 = bn1||bn2;
		System.out.println("bn3(Or)=" +bn3);
		
		//문자 '가' 는 유니코드 44032 로 표현되므로 true 반환
		bn3 = '가' > 30000;
		System.out.println("bn3=" +bn3);

	}

}
