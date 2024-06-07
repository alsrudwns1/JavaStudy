package ex12inheritance;

/*
 * 부모클래스와다른 패키지에 선언되엇으므로 import 해야함
 * 단, 부모클래스는 반드시 public 으로 선언해야 함. 만약 default 로
 * 선언하면 접근 자체가 불가능하므로 import 도 못함
 */

import ex12inheritance.map.Korea;

//자식클래스에서 Korea를 상속
class Seoul extends Korea {
	
	private String city;
	/*
	 * 자식클래스에서는 반드시 부모클래스의 생성자 호출을 통해 먼저
	 * 인스턴스를 생성해야함. 그후 자식 인스턴스가 메모리에 생성됨
	 */
	public Seoul(String name, String city) {
		super(name);
		this.city = city;
	}
	/*
	 * 4개의 접근지정자를 통해 정의한 매서드 호출. 단 부모클래스가
	 * 다른패키지에 선언되었으므로 default, private멤버는 호출불가.
	 */
	public void callMethod() {
		super.publicMethod("callMehod->");
		super.protectedMethod("callMethod->");
		//super.defaultMethod();에
		//super.privateMethod();러
	}
 }

public class E02ProtectedInheritanceMain {

	public static void main(String[] args) {
		
		Seoul seoul = new Seoul("대한민국", "서울");
		seoul.callMethod();

	}

}
