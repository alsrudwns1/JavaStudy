package ex12inheritance;

//자식클래스
public class DeChild extends DeParent {
	//멤버변수
	String stNumber;
	
	//생성자
	public DeChild(String name, int age, String stNumber) {
		/*
		 * 자식은 부모생성자 호출을 통해 먼저 부모인스턴스를 생성한 뒤
		 * 자신의 인스턴스 생성
		 */
		super(name, age);
		this.stNumber = stNumber;
	}
	
	//자식클래스에서 확장한 메서드로 부모클래스에는 정의되어있지않음
	public void study() {
		//부모의 멥버변수 name은 privat이므로 자식에서는 getter를 통해
		//값을 받아야함
		System.out.println(getName() + "이(가) 공부한다.");
	}
	
	/*
	 * 오버라이딩 아님 : 부모클래스에서 private멤버로 선언했으므로 
	 * 자식쪽에선 보이지않아 오버라이딩 대상 x
	 * 해당매서드는 자식쪽에서 새로이 확장한 매서드가 됨
	 */
	public void eat() {
		System.out.println("학생이 먹는다");
	}
	
	/*
	 * 메서드 오버라이딩 조건
	 * 1. 부모클래스에서 선언될때와 비교해 접근범위가 동일하거나 넓으면 가능
	 * 2. 부모에서 default로 선언 시 자식에선 default 혹은
	 * 그보다 더 넓은 public으로 선언하면 오버라이딩 성립
	 */
	@Override
	public String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	
	/*
	 * 매서드의 형태가 부모쪽과 다르므로 오버라이딩 x
	 * 이 경우 오버로딩으로 자식쪽에서 확장한 메서드가 됨
	 */
	public int walk(int age) {
			System.out.println("나이가" + age + "살인 학생이 산책한다");
			return 0;
	}
	//오버라이딩 정의. 메서드의 형태가 완전 동일함
	@Override
	public void excecise() {
		System.out.println("학생이 운동한다");
	}
	//오버라이딩 정의
	@Override
	public void printParent() {
		/*
		 * super의 두가지 활용법
		 * 1. super():부모클래스의 생성자를 호출한다.
		 * 2. super.멤버 : 부모의 멤버변수 혹은 멤버메서드를 호출한다.
		 */
		super.printParent();
		System.out.printf(", 학번:%s\n", stNumber);
	}
	
	/*
	 * 정적(static)메서드는 오버라이딩 대상이 될 수 없다.
	 * 클래스 외부(메서드영역)에 별도로 로드되므로 오버라이딩이 되지않고
	 * 호출 시 각 클래스명을 통해 접근가능
	 */

	public static void staticMethod() {
		System.out.println("학생의 정적메소드");

	}

}
