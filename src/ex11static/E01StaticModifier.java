package ex11static;

/*
 * static variable(정적변수 혹은 메서드)
 * -멤버변수에 static 키워드를 붙히면 정적변수가 된다
 * -정적변수는 JVM(자바가상머신)에 의해 프로그램이 시작되는 시점에서 초기화됨
 * -main()메서드가 실행되기 전에 초기화되므로 main()메서드 실행시 별도의 인스턴스
 * 생성 없이 변수 사용 가능
 * 
 * 접근 방법
 * -클래스 내부: 변수명으로 접근 가능. 일반적인 멤버변수와 동일하게 접근
 * -클래스 외부:
 * 		1.인스턴스 변수를 통해 접근 (권장 아님)
 *		2.인스턴스 생성 없이 클래스명으로 접근 (권장)
 * -메서드 앞에 static을 붙히면 정적매서드가 된다. 정적변수와 모든 특성이 동일.
 */



class MyStatic {
	/*
	 * 멤버변수 : 인스턴스형 멤버변수는 반드시 클래스의 인스턴스를 생성한 뒤
	 * 참조변수를 통해 접근해야함. 일반적인 멤버변수는 인스턴스를 생성하는 시점에 메모리에 로드됨.
	 * (인스턴스(참조)변수는 stack영역, 인스턴스는 heap영역에 생성됨)
	 */
	
	int instanceVar;
	/*
	 * 정적멤버변수: 인스턴스를 생성할 필요 없이 클래스명으로 바로접근할 수 있다.
	 * 자바가상머신이 프로그램을 시작할 때 미리 메모리 영역에 로드됨.
	 */
	static int staticVar;
	
	/*
	 * 인스턴스형 멤버메서드: 인스턴스형 메서드에서는 모든 멤버를 사용할 수 있다.
	 * 인스턴스형 멤버, 정적멤버 둘다 접근가능.
	 */
	void instanceMethod() {
		System.out.println("instanceVar =" + instanceVar);
		System.out.println("staticVar =" + staticVar);
		staticMethod();
	}
	/*
	 * 정적 멤버메서드 : 정적 메서드 내부에서는 인스턴스형 멤버에는 접근 불가.
	 * 정적멤버만 접근 가능.
	 * (main 메서드에서는 static으로 선언된 메서드만 호출할 수 있었음)
	 */
	static void staticMethod() {
		//System.out.println("instanceVar =" + instanceVar);
		System.out.println("staticVar =" + staticVar);
		//instanceMethod();
	}
}

public class E01StaticModifier {

	public static void main(String[] args) {
		
		/*
		 * 일반적인 멥버변수에 접근법: MyStatic 클래스의 인스턴스를
		 * 생성한 뒤 참조변수를 통해 접근
		 */
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar =" +myStatic.instanceVar);
		
		/*
		 * static(정적) 멤버변수 접근법: 클래스명을 통해 직접 접근한다.
		 * 인스턴스를 생성하지 않고 즉시 접근 가능
		 */
		myStatic.staticVar = 200;
		System.out.println("myStatic.instanceVar =" +MyStatic.staticVar);
		
		/*
		 * 정적 변수도 일반적인 멤버변수처럼 참조변수를 통해 접근할 수 있지만
		 * 자바에서는 권장하지 않음. 참조변수를 통해 접근할 거라면 굳이 정적변수를
		 * 사용할 이유가 없기 때문.
		 */
		myStatic.staticVar = 300;
		System.out.println("myStatic.instanceVar =" +myStatic.staticVar);
		
		
		/*
		 * 두개의 인스턴스를 생성한다.
		 */
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		//각 인스턴스 내부에 존재하는 멤버변수에 100과 1000을 할당한다.
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;

		/*
		 * 정적변수는 메모리에 딱 하나만 생성되므로
		 * 어떤 인스턴스 변수로 접근하든 동일한 메모리가 된다. 따라서
		 * 값을 공유하게 되므로 동일한 결과를 출력함.
		 */
		System.out.println("ms1.instanceVar =" +ms1.instanceVar);
		System.out.println("ms2.instanceVar =" +ms2.instanceVar);
		
		//아래 문장을 권장한다. 동일한 메모리에 값을 순차적 할당하는 것으로 보임.
		ms1.staticVar = 800;
		ms2.staticVar = 900;
		System.out.println("ms1.staticVar =" +ms1.staticVar);
		System.out.println("ms2.staticVar =" +ms2.staticVar);
		
		/*
		 * 정적 멤버 메서드에 접근방법은 정적변수와 동일하다. 참조변수를 통해서는
		 * 인스턴스형, 정적형 둘다 접근 가능.
		 */
		myStatic.instanceMethod();
		myStatic.staticMethod();
		
		//MyStatic.instanceMethod();
		MyStatic.staticMethod();
		
	}

}
