package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 예외처리를 할 때 필요에 따라 여러개의 catch 블럭을 쓸 수 있다.
 * 이 경우 반드시 자식 예외 클래스부터 catch 블럭을 추가해야한다.
 * exception 클래스는 모든 예외를 catch 할 수 있으므로 반드시 
 * 마지막 블럭에 사용해야한다. 
 */

public class Ex04MultiCatch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//크기 3인 배열 생성
		int array[] = new int[3];
		try {
			//3개의 문자열 입력받기
			for(int i =0; i<array.length ; i++) {
				
				System.out.print("array[" + i + "]에 저장할 숫자 입력");
				
				/*
				 * 입력한 문자열을 정수로 바꾼 뒤 배열에 저장함.
				 * "1a"와 같이 입력하면 정수로 변경할 수 없어 예외발생
				 */
				array[i]= Integer.parseInt(scanner.nextLine());
				
				
				//1번 인덱스에 0입력시 연산 불가능으로 예외발생
				System.out.println("배열에 저장된 두 숫자 나누기" + 
						array[0]/array[1] );
				
			}
			//나이입력시 문자입력하면 에외발생
			System.out.println("나이를 입력하세요:");
			int age = scanner.nextInt();
			System.out.println("당신의 나이는:" +age);
			
			/*
			 * 배열 크기가3이므로 인덱스는 2까지만 존재. 따라서 인덱스
			 * 관련 에러가 발생함.
			 */
			array[3] = age;
			
		} 
		
		catch (InputMismatchException e) {
			System.out.println("숫자로만 입력하시오");
		}
		catch (ArithmeticException e) {
			System.out.println("산술연산이 불가능합니다.");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력 가능.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 초과");
		}
		/*
		 * exception 클래스는 모든 예외클래스의 부모이므로 catch 절의 마지막에
		 * 기술해야 한다. 위쪽으로 이동시키면 에러가 난다.
		 * 해당 클래스로 모든 에러를 catch 할 수 있기 때문.
		 */
		catch (Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		 * 앞에서 예외가 발생하더라도 예외처리를 했으므로 프로그램은
		 * 마지막까지 실행된 후 정상적으로 종료된다. 즉 실행의 흐름이 마지막까지
		 * 이어지게 하는 것이 예외처리의 목적이다.
		 */

	}

}
