package ex16exception;

public class Ex02PreDefineException1 {

	public static void main(String[] args) {
		
		System.out.println(" ### ArrayIndexOutOfBoundsException ### ");
		
		//크기가 2인 배열을 생성함.
		int[] intArr = new int[2];
		/*
		 * 예외가 발생할 수 있는 지역을 try문으로 먼저 묶어준다.
		 * 예외가 발생되면 JVM(자바가상머신)은 해당 예외에 관련된 인스턴스를
		 * 만들어서 프로그램 쪽으로 전달(throw)한다. 이때 catch 절에서 
		 * 예외인스턴스를 잡아주는 것을 "예외처리"라고 한다.
		 * 만약 예외인스턴스를 잡아주지 못하면 프로그램이 비정상적인 종료가 됨
		 */
		try {
			intArr[0] = 100;
			System.out.println("0번 방은 : " + intArr[0]);
			intArr[1] = 200;
			System.out.println("1번 방은 : " + intArr[1]);
			
			// 예외가 발생되는 지점. 해당코드가 실행될 때 예외가 발생하여
			// JVM이 예외인스턴스를 만들어 프로그램으로 던진다.
			intArr[2] = 300;
			System.out.println("2번 방? : " + intArr[2]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			//JVM이 throw 한 예외인스턴스를 catch 절에서 잡아 처리한다.
			//그러면 예외가 발생되어도 프로그램의 실행은 유지된다.
			
			//예외메세지1 : 개발자가 임의로 메세지를 출력한다.
			System.out.println("예외 발생");
			
			//예외메세지2 : 간략한 설명을 출력한다.
			System.out.println("예외 메세지:" + e.getMessage());
			
			//예외메세지3 : 예외에 대한 디테일한 설명을 출력한다.
			e.printStackTrace();
		}
		/*
		 * 예외처리를 통해 실행의 흐름이 중단되지 않으면 아래 문장은 정상
		 * 적으로 출력된다. 즉 예외처리의 목적은 프로그램의 비정상적 중단을
		 * 막는 것이다.
		 */
		System.out.println("0번방 재출력:" + intArr[0]);
		System.out.println(" ### ArrayIndexOutOfBoundsException 발생 후 ###");

	}

}