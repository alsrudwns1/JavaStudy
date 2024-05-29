package ex04controlstatement;

/*
 * else 문에는 조건식 들어가면 에러남
 */

public class E01If03 {

	public static void main(String[] args) {
		
		int kor = 99, eng = 70, math = 64;
		
		/*
		 * 평균값은 소수점이 나올 수 있으니 실수형으로 선언한다.
		 * double 의 결과를 얻기 위해 3.0으로 나눠줌
		 */
		
		double avg = (kor+eng+math) / 3.0;
		System.out.println("평균점수는(그대로):"+avg);
		System.out.println("평균점수는(소수2자리):%.2f\n"+avg);
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("학고");
		}
		
		
		System.out.println("잘못된 조건식의 IF문");
		/*
		 * 앞에서 작성한 IF문에서 조건 순서만 변경되었으나, 60점 이상이라는
		 * 조건에 만족하기 때문에 높은 점수라도 모두 D학점이 출력된다.
		 * 문법 오류는 없으나 논리 오류가 있다.
		 */
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("학고");
		}
	}

}
