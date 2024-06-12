package ex15usefulclass;

/*
 * Object 클래스 
 * - 자바에서는 최상위 클래스이다
 * - 별도의 선언없이 오브젝트 클래스에 정의된 모든메서드 호출가능
 * - 개발자가 정의한 모든 클래스는 오브젝트의 참조변수로 참조가능
 * ex) Object obj = new Person() 혹은
 *	   void myFn(Object obj) {}
 *
 *toString() 메서드
 *-object에 정의된 메서드로 print()문이 문자열을 출력하기 전에 자동호출
 *-인스턴스 변수를 문자열 형태로 변환해 반환
 *-필요한 경우 클래스 정의시 적절히 오버라이딩해 재정의하는것이 좋다. 
 *단, 필수사항은 아님
 */

/*
 * 해당 클래스는 tostring()을 오버라이딩하여 멤버변수를 반환하도록 정의.
 */
class myFriends extends Object {
	String myName;
	public myFriends(String name) {
		myName = name;
		
	}
	@Override
	public String toString() {
		return "이름: " + myName;
	}
}
//tostring을 오버라이딩 하지 않음
class yourFriends extends Object {
	String myName;
	public yourFriends(String name) {
		myName = name;
	}
}

public class E04Object1toString {

	public static void main(String[] args) {
		//인스턴스 생성
		myFriends fnd1 = new myFriends("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		
		
		// tostring을 오버라이딩 했으므로 이름이 출력됨
		System.out.println(fnd1);
		//인스턴스의 참조값이 출력됨
		System.out.println(fnd2);

	}

}
