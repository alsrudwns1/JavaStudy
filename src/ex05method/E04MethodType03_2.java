package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자:");
		int s = scanner.nextInt();
		System.out.print("두번째 숫자:");
		int e = scanner.nextInt();
		
		inputGugudan(s, e);

	}
	
	static void inputGugudan(int sNum, int eNum) {
		for(int dan = sNum; dan <=eNum; dan++) {
			for(int su = 1; su <=9; su++ ) {
				System.out.printf("%2d*%d=%2d",dan,su,(dan*su));
				System.out.print("");
			}
			System.out.println();
		}
		
	}

}
