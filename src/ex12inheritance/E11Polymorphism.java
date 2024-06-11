package ex12inheritance;

//부모클래스
class MyParent {
	int parentMember;
	void parentMethod() {
		System.out.println("부모의 메소드:parentMethod()");
	}
}

//자식클래스
class MyChild extends MyParent {
	//자식에서 확장한 멤버변수
	int childMember;
	//확장한 멤버메서드
	void childMethod() {
		System.out.println("자식의 메소드:childMethod()");
	}
	//부모에서 정의한 메서드를 오버라이딩해서 재정의
	@Override
	void parentMethod() {
		System.out.println("자식에서 overriding 한 메소드"
				+ "parentMethod()");
	}
	//매서드명은 동일하지만 매개변수가 틀리므로 오버로딩한 매서드임.
	//따라서 자식에서 확장한 멤버메서드가 된다
	void parentMethod(int childMember) {
		this.childMember = childMember;
		System.out.println("overloading: 자식에서 확장 한 메소드"
				+ "parentMethod(param1)");
	}
}

public class E11Polymorphism {

	public static void main(String[] args) {
		//동질화: 참조변수와 인스턴스의 타입이 동일
		MyChild myChild = new MyChild();
		//동질화의 경우 인스턴스 전체 멤버에 접근 가능
		myChild.childMember = 10;
		myChild.parentMember = 100;
		myChild.childMethod();
		//오버로딩한 메서드(확장한멤버)
		myChild.parentMethod(1000);
		//오버라이딩 해서 재정의한 메서드(자식쪽 매서드가 호출됨)
		myChild.parentMethod();
		
		
		
		MyParent parent1 = myChild;
		parent1.parentMember = 1;
		parent1.parentMethod();
		MyParent myParent = new MyChild();
		myParent.parentMember=1;
		myParent.parentMethod();
		
		//(MyChild)myParent.childMember = 1; 오류
		((MyChild)myParent).childMember = 1;
		
		((MyChild)myParent).childMethod();
		((MyChild)myParent).parentMethod();
		
		//자식타입으로 형변환후 해당 참조변수를 통해 자식멤버에 접근.
		MyChild child2 = (MyChild)myParent;
		child2.childMember = 1;
		child2.childMethod();
		child2.parentMethod();
		
		/*
		 * 자바에서 생성한 모든 클래스는 object클래스를 상속한다.
		 * 따라서 모든 인스턴스는 object의 참조변수로 참조가 가능함.
		 * 또한 object 클래스에 정의된 모든 매서드를 별도처리없이 사용할
		 * 수 있고, 필요하다면 오버라이딩도 할수있다.
		 */
		Object object = new MyChild();
		((MyParent)object).parentMethod();
	}

}
