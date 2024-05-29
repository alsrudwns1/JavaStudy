package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {
		System.out.println("4월엔 벚꽃~~!");
		//tab(탭) 기능으로 스페이스 4칸 띄워짐
		System.out.println("4월엔 \t벚꽃~~!");
		
		//줄바꿈(New line) 기능 
		System.out.println("자바월드에 오신걸 환영\n");
		System.out.println("열심히\n하자\n");
		
		//System.out.println("나는 "개발자"가 되고싶다"); 오류남
		
		//문자열 사이에 "" 포함하고 싶을 때 사용
		System.out.println("나는 \"개발자\" 가 되고싶다");
		
		
		int kor = 81, eng = 97, math = 79;
		
		//printf : 서식에 맞춰 출력할 때 씀
		// 정수는 %d, 줄밖무은 %n 또는 \n으로 표현한다.
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math);
		
		// 위와 같은 출력 문장이나 println 사용 시 문자열과 변수를 분리해야하므로 좀 더 복잡함
		System.out.println("\n국어:"+kor +",영어:"+eng+",수학:" + math);
		
		// 실수는 %f 사용한다. 또한 정수와 실수의 연산이므로 결과는 실수가 반환되어 double 타입의 변수에 대입.
		double avg = (kor + eng + math) /3.0;
		System.out.printf("평균:%f%n", avg);
		
		/*
		 * 자리수 지정하기
		 * %4d : 정수 출력 시 4칸을 확보한 후 표현한다
		 * %6.2f : 실수 출력 시 전체자릿수 6자리, 소수이하 2자리로 표현한다
		 * 또한, 양수는 우측정렬, 음수는 좌측정렬된다.
		 */
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d," +
		" 평균:%f %n", kor, eng, math, avg);
		
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d," +" 평균:%7.4f %n", kor, eng, math, avg);
		
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d," +" 평균:%-7.2f %n", kor, eng, math, avg);
	}

}
