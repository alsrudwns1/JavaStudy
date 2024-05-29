package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		/* 정수 자료형
		 * -byte, short, int, long 타입이 있다
		 * - 각 자료형의 표현범위는 교안을 참고
		 * - 일반적으로 cpu는 정수형 연산 시 ,int 형을 가장 빨리 처리
		 * - 즉 정수형 변수 사용 시 대부분 int 형을 사용한다.
		 * 
		 */
		
		// int 형 변수 선언 후 초기값 할당
		int int1 = 100;
		int int2 = 200;
		// 300의 결과값이 변수에 할당
		int result1 = int1 + int2;
		
		// int 형 끼리의 연산은 int형의 결과가 반환
		System.out.println("int1 + int2=" + result1);
		
		
		// 100 / 200 의 결과는 0이 나오게 된다.
		// java 에서는 정수와 정수의 연산결과로 정수가 반환된다.
		// 실수의 결과를 반환받고 싶다면 형변환을 해야한다.
		result1= int1 / int2;
		System.out.println("int1 / int2 = "+result1);
		
		/*
		 * - 동일한 타입의 변수를 2개 이상 선언할 때는 콤마를 사용.
		 * - int형보다 작은 자료형을 연산하면 CPU는 int 형으로 변환해 계산
		 * - CPU는 정수의 연산인 경우 int 형에 최적화 되어있기 때문.
		 * - byte, short 형은 게임캐릭터의 움직임이나 음원파일 등을 포현할 때 주로 사용됨.
		 */
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2;
		System.out.println("byte1 + byte2 = "+result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short2 =" +result3);
		
		
		/*
		 * - 동일 자료형끼리의 연산은 동일 자료형이 되는 것이 기본 원칙이다.
		 * - 큰 자료형과 작은 자료형을 연산하면 큰자료형으로 자동 변환된다.
		 *  이유는 데이터의 손실이 있을 수도 있기 때문.
		 */
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 =" + result4);
		
		result4 = long1 + long2;
		System.out.println("long1 + long2 = "+result4 );
		
		/*
		 * 자바 컴파일러는 정수형 상수를 기본적으로 int 로 간주하기 때문에
		 * 아래 정수를 메모리에 로드하는 순간 에러가 발생한다.
		 * 이때 접미사(L 혹은 l)를 붙여서 int 형 자료가 아는 long 형의 자료임을
		 * 컴파일러에게 알려줘야한다. 이와같이 할당을 위해 입력되는 순자도 자료형을
		 * 기반으로 메모리에 로드되는데, 이를 가르켜 리터럴(literal) 이라고 한다.
		 */
//		long long3 = 2200000000; //에러발생
		long long4 = 220000000L;
		long long5 = 2200000000l;
				
		System.out.println("long4="+long4);

	}
}
