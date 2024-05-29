package ex04controlstatement;

/*
 * while문
 * 반복의 횟수가 명확치 않을 경우 주로 사용함
 * 반복을 위한 초기값, 조건식, 증감식을 따로 작성하는 형식
 * 
 * 반복을 위한 변수의 초기값;
 * while(반복의 조건) {
 * 	실행문;
 *	증감식; <= 반복문 탈출을 위함
 *}
 */

public class E03While {

	public static void main(String[] args) {
		
		//반복을 위한 변수 i를 생성한 뒤 1로 초기화
		int i = 1;
		//반복을 위한 조건: i가 10이하일때만 반복
		while(i <= 10) {
			//변수의 증가값을 단순히 출력
			System.out.println("변수i="+i);
			//반복문 탈출을 위한 증가식
			i++;
		}
		
		//1에서 10까지의 합을 구하는 프로그램
		int sum = 0;
		int j = 1;
		while( i<=10) {
			sum +=j;
			j++;
		}
		System.out.println("1~10까지의합sum="+sum);
		
		
		// 1~100 까지의 정수중 3의 배수이거나 4의 배수인 정수의 합
		
		int total = 0;
		int k = 1;
		while(k<=100) {
			//3의 배수 또는 4의 배수이므로 or
			if(k%3==0 || k%4==0) {
				total +=k;
				System.out.println("k="+k);
			}
			k++;
		}
		System.out.println("3또는4의 배수의 합"+total);
		
		
		// 구구단을 출력하는 프로그램
		int dan = 2;
		while(dan<=9) {
			int su = 1;
			while(su <=9) {
				// dan = 첫번째 %2d, su = 두번째 %d, (dan*su) = %2d
				// %2d = 결과창 공백(스페이스바)
				System.out.printf("%2d*%d=%2d",dan,su,(dan*su));
				System.out.print("");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n===========================\n");
		
		
		//행으로 4번 반복하기 위한 변수 선언
		int x = 1;
		while(x<=4) {
			//행이 고정된 상태에서 열을 4번 반복
			int y=1;
			while(y<=4) {
				//행과 열의 번호가 동일할 때만 1 출력
				if(x==y) {
					System.out.print("1");
				}
				else {
					//번호가 다르면 0을 출력
					System.out.print("0");
				}
				y++;
			}
			System.out.println();
			x++;
		}
	}

}
