package ex12inheritance.map;

//부모클래스 : 자식클래스와 다른 패키지에 선언되었다.
public class Korea {
	//멤버변수, 생성자 정의
	private String name;
	public Korea(String name) {
		this.name = name;
	}
	
	//4가지의 접근지정자를 통해 멤버메서드 정의
	public void publicMethod(String loc) {
		/*
		 * public으로 선언된 멥버메서드는 어디서든 접근가능.
		 * 동일 패키지, 다른 패키지, 외부 클래스, 상속 등 모든 영역에서 접근 가능.
		 */
		System.out.println(loc + "publicMethod()호출");
		/*
		 * public 으로 선언된 메서드는 패키지가 다른 클래스에서는 호출할 수 없음.
		 * 해당 메서드를 통해 간접호출해야함.
		 */
		defaultMethod("publicMethod->");
	}
	protected void protectedMethod(String loc) {
		/*
		 * 서로 패키지가 다른 2개의 클래스가 상속관계일 경우 접근을 허용.
		 * 즉 default 보다 좀 더 넓은 접근범위를 지님.
		 */
		System.out.println(loc + "protectedMethod()호출");
		privateMethod("protectedcMethod->");
	}
	void defaultMethod(String loc) {
		/*
		 * 패키지가 동일할때만 접근허용, 패키지가 다른 경우 상속이 아니라면
		 * public으로 선언해야만 접근가능.
		 */
		System.out.println(loc + "defaultMethod()호출");
	}
	
	private void privateMethod(String loc) {
		//동일클래스 내부에서만 접근허용. 멤버 이외에는 접근불가
		System.out.println(loc + "privateMethod()호출");
	}

}
