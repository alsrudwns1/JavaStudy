package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {
		/*
		 * 실수 자료형
		 * - 정수형보다 실수형이 더 큰 자료형이다. 0과 1 사이에 무한히 많은 실수가 존재하기 때문.
		 * - 따라서 long(정수형) 과 float(실수형)을 연산하면 float 의 결과가 나온다.
		 */
		long long1 = 100;
		float float1 = 200;
		
		//실수형으로 자동변환된다. 300.0의 결과가 나옴.
		float result1 = long1 + float1;
		System.out.println("long1 + float1 = " + result1);
		
		/*
		 * float(실수)와 long(정수)의 연산결과를 long으로 받고싶다면 
		 * 방법1: float 를 long 으로 강제형변환 후 연산한다.
		 * 방법2: 계산결과 전체를 long으로 강제형변환
		 */
		long result2 = long1 + (long)float1;
		System.out.println("형변환 후 연산=" + result2);
		long result3 = (long)(long1 + float1);
		System.out.println("계산 후 형변환=" +result3);
		
		/*
		 * - 실수형의 기본은 double 이다
		 * - 단 소수점이 없는 데이터는 float에 대입할 수 있다.
		 * - 소수점이 있는 데이터를 float 에 대입하려면 접미사 F 또는 f 를 붙혀야 한다.
		 * - 형변환 후 대입이 가능하지만 권장안함
		 */
		float f3 = 100;
		
//		float f4 = 3.14;    3.14를 double 로 인식하기 때문에 오류가 난다.
		
		// 에러 해결을 위해 float 로 강제형변환 후 대입
		float f4 = (float)3.14;
		System.out.println("f4=" + f4);
		
		// 에러 해결을 위해 접미사 F (접미사를 통해 float 자료임을 명시함)
		float f5 = 3.14F;
		System.out.println("f5 = " +f5);
		
		// float 형 끼리의 연산은 기본규칙을 따르므로 float 가 됨
		float f6 = f3 + f4;
		System.out.println("f6 = " + f6);
		
		// float 와 double 의 연산은 큰 자료형인 double 로 반환된다.
		double d1 = 3.14;
		double d2 = f6 + d1;
		System.out.println("d2=" + d2);

	}

}