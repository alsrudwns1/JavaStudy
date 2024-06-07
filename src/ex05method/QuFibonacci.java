package ex05method;

import java.util.Scanner;
public class QuFibonacci {
	
    public static void fibonacciProgression(int cnt) {
        int one = 0;
        int two = 1;
        int next;

        System.out.print("숫자를 입력하세요: " + cnt + "\n");

        for (int i = 0; i < cnt; i++) {
            if (i <= 1) {
                System.out.print(i + ", ");
            } else {
                next = one + two;
                System.out.print(next + ", ");
                one = two;
                two = next;
            }
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int cnt = scanner.nextInt();
        scanner.close();
        fibonacciProgression(cnt);
	}
}
