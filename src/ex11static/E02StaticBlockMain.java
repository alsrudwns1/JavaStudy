package ex11static;

/*
 * static 블럭
 * :동일 클래스 내에 main()메서드보다 먼저 실행되는 블럭으로 main 메서드의
 * 실행코드가 없어도 먼저 실행된다. 또한 생성자보다도 먼저 실행된다.
 * 따라서 프로그램에서 전처리를 해야하는 경우 사용할 수 있다.
 */

public class E02StaticBlockMain {
	 
	//인스턴스형 멤버
	int instanceVar;
	void instanceMethod() {}
 
	//정적 멤버
	static int staticVar;
	static void staticMethod() {
		int localVar;
		System.out.println("정적메소드");
	}
	
	//static 블럭 정의
	static {
		//블럭 내에서 정적멤버 변수에 접근가능
		staticVar = 1000;		
		
		/*
		 * 블럭 내에서만 사용할 수 있는 변수, 블럭 내에서는 일반변수를 생성한 후
		 * 사용할 수 있다.
		 */
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+ localVar); 
		//System.out.println("instanceVar="+ instanceVar);  
		//instanceMethod();
 
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		//정적멤버 사용가능
		System.out.println("===static block 끝===");
	}
	
	/*
	 * 생성자 메서드: 생성자에서는 정적멤버에 접근가능.
	 * 일반적인 멤버변수와 동일
	 */
 
	public E02StaticBlockMain() {
 
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자==");
	}
	public static void main(String[] args) {
		
		System.out.println("==메인메소드==");	
		/*
		 * static 블럭내에서 선언된 변수는 지역변수이므로 main메서드에선느
		 * 사용불가. 해당 지역에서만 사용가능.
		 */
	 
		//System.out.println("localVar="+ localVar);
		 
		new E02StaticBlockMain();
	}
}

