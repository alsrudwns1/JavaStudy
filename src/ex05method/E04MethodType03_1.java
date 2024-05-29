package ex05method;

import java.util.Scanner;
/*
 * 매서드형식3: 매개변수는 있으나 반환값은 없는 경우
 * : 값을 전달받은 후 연산하고 해당 결과를 반환하지 않고 즉시 출력하는 경우 사용.
 * 값을 소비하는 형태의 매서드이다.
 */

public class E04MethodType03_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작값:");
		int s = scanner.nextInt();
		System.out.print("종료값:");
		int e = scanner.nextInt();
		/*
		 * 반환값이 없는 매서드이므로 단독적으로 호출한다.
		 * 앞에서 입력받은 2개의 정수를 인수로 전달한다.
		 */
		myWantSum(s, e);
	}
	
	/*
	 * main매서드에서 호출 시 전달한 2개의 인수를 매개변수를 통해 순서대로 받음.
	 * 매개변수는 해당 메서드에서 즉시 이용할 수 있는 지역변수가 됨
	 */
	static void myWantSum(int startNum, int endNum) {
		
		/*
		 * 1에서 10까지의 합을 구하는 수열프로그램을 시작값과 종료값만
		 * 변수로 변경하여 원하는 구간의 합을 구하는 프로그램으로 바꾸기
		 */
		int sum = 0;
		for(int i =startNum; i <=endNum ; i++) {
			sum +=i;
		}
		//결과를 반환하지 않고 즉시 출력한다
		System.out.printf("%d~%d까지의 합은: %d", startNum, endNum, sum);
	}

}
