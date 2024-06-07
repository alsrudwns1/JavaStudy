package ex04controlstatement;

public class QuPyramid01T {

	public static void main(String[] args) {
		//행을 반복
		for(int i=1; i<=5; i++) {
			//열을 반복
			for(int j = 1; j <=5; j++) {
				//i(행)의 갯수만큼 j(열)을 출력함.
				if(j <= i) {
					System.out.print("* ");		
				}
			}
			System.out.println("");
		}
		
		
		System.out.println("====================");
		
		
		int i = 1; // for 문의 지역변수이므로 새롭게 선언 가능
		while(i <=5) {
			int j = 1;
			// i번 만큼 반복해서 출력
			while(j <= i) {
				System.out.print("* ");		
				j++;
			}
			i++;
			System.out.println("");
		}

	}

}
