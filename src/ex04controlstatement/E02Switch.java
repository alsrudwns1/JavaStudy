package ex04controlstatement;

import java.util.Scanner;

/*
 * switch문
 * :if문처럼 조건에 따라 분기하는 제어문으로, 정수식의 값과 동일한 부분을 찾아
 * 실행하는 형태를 가진다.
 * switch 문에서는 조건문 사용 불가, 산술식 또는 정수식 사용
 */

public class E02Switch {

	public static void main(String[] args) {
		
		/*
		 * Scanner 클래스: 사용자로부터 입력값을 받기 위한 클래스.
		 * 해당클래스의 매서드가 실행되면 잠깐 실행이 중지되고 입력을 기다림.
		 * 보통 문자열이나 정수를 입력받기 위해 사용됨.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		//nextInt()는 정수를 입력받기 위한 메서드이므로 문자를 입력하면 에러 발생
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는:"+iNum);
		
		// 정수를 3으로 나누면 나머지는 0,1,2만 생성된다.
		int remain = iNum % 3;
		switch(remain) {
		case 0:
			System.out.print("나머지는 0입니다.");
			break;
		case 1:
			System.out.print("나머지는 1입니다.");
			break;
		default:
			System.out.print("나머지는 2입니다.");
			//default 다음에는 실행할 문장이 없으므로 브레이크 생략함
		}
		
		/*
		 * switch 문 사용시 주의사항
		 * -long 타입 변수 사용 불가능
		 * - byte, short, int, char, String 만 가능
		 * - 논리식, 조건식도 사용불가
		 */
		
		long ln = 100;
		/*
		switch(ln) {
		case 100:
			System.out.print("long 타입 사용?");
			break;
		default: 
			System.out.print("스위치문에서는 long 타입 사용 불가능");
		}
		조건식은 사용 불가하므로 에러발생
		switch(iNum%3==0) {
			System.out.print("논리식도 사용불가");
		}
		*/
		
		String title = "자바";
		switch(title) {
		case "자바": System.out.println("자바조아");
			break;
		case "java": System.out.println("javagood");
			break;
		}
		
		/*
		 * 여러 case를 동시에 처리할땐 break 없이 case 나열한다.
		 * if문에서 || 를 사용한 것과 동일함
		 */
		
		int season = 8;
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("여름");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("겨울");
		}
		
		/*
		시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
			프로그램을 작성하시오. 90점이상은 A학점...
			60점 미만은 F학점을 출력하면 된다. 
			단, switch문으로 작성하시오. 
		 */
		
		int math = 70, eng = 80, lan = 90;
		int avg = (math + eng + lan) / 3;
		System.out.println("평균점수: " + avg);
		
		//평균점수를 10으로 나눈 몫을 통해 점수의 구간을 특정가능.
		// switch 에선 < , > 를 쓸 수 없으므로 이렇게함
		switch(avg / 10) {
		case 9: case 10: 
				System.out.println("A학점");
				break;
		case 8: case 7:
				System.out.println("b학점");
				break;
		default:
				System.out.println("f학점");
		}
	}

}
