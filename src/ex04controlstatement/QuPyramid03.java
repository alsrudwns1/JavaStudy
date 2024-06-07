package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		
		// 행 갯수 지정
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			//공백 출력하기
			for(int j = 1; j<=num-i; j++) {
				System.out.print(" ");
			}
			
			// * 출력하기. 조건의 일반식에 의해 1,3,5,7... 이 생성됨
			for(int k=0; k<(i*2+1); k++) {
				System.out.print("*");
				
			}
			//한 행 출력 후 줄바꿈
			System.out.println("");
			
			
		}
		
		

	}

}
