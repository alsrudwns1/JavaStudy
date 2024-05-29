package ex04controlstatement;

/*
 * break: 반복문이나 switch 문에서 주로 사용, 블럭내에서 탈출할때 씀
 * 중첩반복문이라면 가장 가까운 블럭 하나만을 탈출함
 * 
 * continue : 반복문의 처음으로 돌아감. while문의 경우 조건을 확인하고,
 * for 문의 경우 증감식이 실행됨. continue 아래의 문장은 실행되지 않는다
 */

public class E06BreakContinue {

	public static void main(String[] args) {
		
		int i = 0;
		// 무한루프 조건으로 while문 작성
		while(true) {
			// 반복문 내에서 break, continue 사용 시 조건문과 함께 씀.
			
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continue이전 출력문");
			if(i%2==0) continue;
			System.out.println("continue이후 출력문");
			
			System.out.println("break이전 출력문");
			if(i==3) break;
			System.out.println("break이후 출력문");
		}
		
		
		// 중첩된 반복문 안에서 break를 만나면 가장 가까운 반복문 하나만을 탈출함
		for(int x=1; x<=5; x++) {
			System.out.println("x=" +x);
			for(int y=1 ; y<=5; y++) {
				System.out.println("y=문 +y");
				if(y==3) 
					break;
			}
		}

	}

}
