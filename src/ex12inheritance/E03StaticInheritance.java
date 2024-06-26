package ex12inheritance;

/*
 * static(정적) 타입의 멤버도 상속이 되고, 하위클래스에서 접근 시 멤버변수의
 * 이름만으로도 접근이 가능하다.
 * 단, 클래스 외부에서 접근할 경우 인스턴스 생성없이 클래스명을 통해 접근 가능.
 * 즉 static이 가진 기본규칙을 따른다.
 */

class Adder {
	
	/*
	 * static으로 선언된 멤버변수는 실제로는 클래스 외부(method영역)에
	 * 생성되어 있으므로 클래스명을 통한 접근이 허용된다.
	 * 코드레벨에서 보면 해당 클래ㅔ스의 멤버변수이므로 변수명 만으로도
	 * 접근하는 것도 가능
	 */
	
	public static int val = 0;
	
	public void add(int num) {
		val +=num;
		Adder.val +=num;
	}
}

/*
 * 부모의 멤버변수가 public 이므로 접근의 제한이 없다. 따라서 자식클래스에
 * 작성된 모든 코드는 문제없이 실행됨.
 */
class AdderFriend extends Adder {
	
	public void friendAdd(int num) {
		//변수명만으로 접근가능
		val += num;
		//클래스명을 통해 접근가능
		Adder.val += num; //권장사항
	}
	public void showVal() {
		System.out.println("val=" + val);
		System.out.println("val=" + Adder.val);
	}
}


public class E03StaticInheritance {

	public static void main(String[] args) {
		//부모클래스를 통한 인스턴스 생성
		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1);
		adFriend.friendAdd(3);
		Adder.val += 5;
		AdderFriend.val += 7;
		
		adFriend.showVal();
		
		/*
		 * 앞에서 호출한 메서드는 모두 메서드영역에 생성된 정적변수 val에
		 * 더해지게 되므로 출력결과는 20이됨
		 */
		

	}

}
