package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * 자동형변환: 작은 자료형의 데이터를 큰 자료형에 대입할 때 자동으로 형변환 일어남
		 */
		
		// byte 가 short 보다 작은 자료형이므로 자동형변환 되어 대입됨
		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		
		// 자동형변환이 일어나지 않는다. CPU는 int 보다 작은 자료형 연산 시
		// int로 간주하며 결과도 int 로 반환
		int num1 = b1 + s1;
		System.out.println("num1은" + num1);
		
		/*
		 * char형(문자타입)에 byte형(정수타입)을 바로 대입할 수 없다.
		 * 특성이 다르므로 강제형변환 후 대입해야 한다.
		 */
		//char ch1 = b1;
		char ch2 = (char)b1;
		System.out.println("b1=" +b1+",ch2=" +ch2);
		
		
	    /*
	     * 명시적 형변환: 큰 상자의 자료를 작은 상자의 자료형에 할당해야 할 때 씀.
	     * 자료의 손실이 있을 수 있으므로 필요한 경우에만 씀
	     */
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d\n", b2 ,s2);
		
		
		/*
		 * 소수점 아래부분이 버려지므로 데이터 손실이 있는 경우이다.
		 * 흔히 "원 단위 절삭" 같은 경우에 씀
		 */
		int num3;
		double dl = 3.14;
		num3 = (int)dl;
		System.out.printf("데이터손실:num3=%d, dl=%.2f %n", num3 ,dl);
		//서식문자 사용 시 %.2f 는 정수부는 모두 출력하고, 소수 이하는 2자리까지만 표현
		
		
		//문자는 메모리에 저장 시 아스키코드로 저장되므로 int 와의 연산을 진행한 뒤
		//문자로 표현하고 싶다면 char 형으로 강제변환
		char ch3 = 'A' , ch4;
		int num4 = 2;
		
		//A+2 = > C가 할당됨
		ch4 = (char)(ch3 + num4);
		System.out.println("ch4=" + ch4);
		
		

	}

}
