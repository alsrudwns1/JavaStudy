package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {
		/*
		 * 상수: 저장된 값이 변하지 않는 메모리의 한 종류로 선언할 때 앞부분에 final 을 붙혀준다
		 * - 상수는 한번만 초기화되고, 이후에는 값을 변경할 수 없다.
		 * - 선언시 전체를 대문자로 기술한다. 만약 연결할 단어가 있다면 가독성을 위해 언더바를 사용한다
		 * - 주로 프로그램에서 코드의 가독성을 높여줌
		 */
		
		// 상수 선언과 동시에 초기화
		final double PI = 3.14;
		System.out.println("PI(원주율)=" +PI);
		
		//에러발생. 상수는 한번 초기화하면 변경할 수 없기 때문.
		//PI = 3.141592;
		
		// 상수는 선언과 초기화를 분리할 수 있다.
		final String NICK_NAME;
		
		//하지만 초기화가 안된상태에서는 사용할 수 없다. 에러 발생.
		//System.out.println("우리는" + NICK_NAME);
		
		// 반드시 초기화 후 사용해야 함.
		NICK_NAME = "개발자";
		System.out.println("우리는" + NICK_NAME);
		
		
		/*
		 * 가위바위보 만들기. 제작자가 1,2,3 으로 정한 후 진행한다고 가정
		 */
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		int computer, user;
		
		
		//1 과 3은 개발자 본인만 알수있는 내용이므로 가독성 떨어짐. 코드 분석 절차필요 
		computer = 1;
		user = 3;
		System.out.println("컴퓨터 승");
		
		
		//1,2,3 대신 누가 보더라도 이해할 수 있는 단어를 사용해 가독성을 높힘
		computer = SCISSOR;
		user = PAPER;
		System.out.println("컴퓨터 승리");

	}

}
