package ex04controlstatement;

/*
 * while 문과 같은 반복문으로 초기값, 조건식, 증감식이 한 줄에 있어
 * 반복의 횟수를 명확히 알 수 있는 반복문이다.
 * 따라서 반복의 횟수가 정해져있는 경우 주로 쓴다.
 * 형식>
 * 		for(초기값; 조건식; 증감식) {
 * 			실행문;
 * 		}
 */

public class E05For {

	public static void main(String[] args) {
		
		for(int i=1; i<=5 ; i++) {
			System.out.println("i="+i);
		}
		
		int sum= 0;
		for(int j = 1; j <=100 ; j++) {
			sum +=j;
		}
		System.out.println("1~100까지 합:" + sum);
		
		
		// 1~ 10 정수 중 2의 배수의 합 (방법1)
		int total = 0;
		
		for(int i =1; i <=10; i++) {
			// 2의 배수가 맞는지 확인
			if(i%2==0) {
				total +=i;
			}
		}
		System.out.println("1~10사이 2의배수의 합(방법1):" +total);
		
		
		//1~10 정수 중 2의 배수의 합 (방법2)
		total = 0;
		for(int i =0; i<=10; i+=2) {
			total +=i;
		}
		System.out.println("1~10사이 2의배수의합(방법2):" + total);
		
		// for 문으로 무한루프 만들 시 (;;)로 표현. while(true)와 같은효과
		int a = 1;
		for(;;) {
			System.out.println("for문으로 만든 무한루프" +a);
			a++;
			// 루프 내에서 a를 증가시키고 1000이 되면 반복문 탈출.
			if(a==1000) break;
		}
		
		// for 문의 끝에 ;를 사용하면 반복할 문장이 없는 것으로 간주됨
		// for 문과 상관없이 한번만 실행되게 된다. 잘못된 문장.
		for(int j =0 ; j<=5; j++);
		{
			System.out.println("여긴어디?");
		}
		// for 문에서 선언한 변수 j는 지역변수이다. for문 밖에서 사용불가
		//System.out.println("위 for문에서 선언한 변수 j="+j);
		System.out.println("위 메인함수 지역에서 선언한 변수 total="+total);
		
		
		// i 를 main 메서드 지역에서 선언했으므로 for 안쪽에서도 사용가능
		int i = 0;
		for( ; i<=5; i++) {
			System.out.println("for문 안에서의 i값" +  i);
		}
		System.out.println("for문 밖에서의 i값" +i);
		
		
		/*
		 * 중괄호가 나올 시 하나의 지역이 형성된다.
		 * if문, while 문 등의 제어문도 하나의 지역을 형성하게 된다
		 */
	
		
		//구구단 
		int dan = 2;
		for( ; dan<=9; dan++) {
			int su = 1;
			for( su = 1; su <=9; su++) {
				System.out.printf("%2d*%d=%2d",dan,su,(dan*su));
				System.out.print("");
			}	
			// 하나의 단을 모두 입력한 뒤 줄바꿈처리
			System.out.println();
			
		}
		System.out.println("\n===========================\n");
		
	}

}
