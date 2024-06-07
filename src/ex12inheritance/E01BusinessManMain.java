package ex12inheritance;

/*
 * 상속(Inheritance)
 * :기존에 정의된 클래스에 메서드와 변수를 추가하여 새로운 클래스를 정의하는 것을 말함.
 * 부모클래스를 자식클래스가 상속할 때는 extands 키워드를 사용한다.
 */

//부모(상위)클래스 : 일반적인 사람을 추상화
class Man {
	
	//멤버변수는 private 이므로 클래스 내부에서만 접근 가능하다.
	private String name;
	
	//생성자: 오버로딩으로 2개를 정의
	public Man() {
		System.out.println("Man 클래스 디폴트 생성자 호출됨");
		}
	public Man(String name) {
		this.name = name;
		System.out.println("Man클래스 인자 생성자 호출됨");
	}
	/*
	 * 멤버메서드에서는 private 멤버라도 동일 클래스 내부이므로
	 * 접근이 가능하다.
	 */
	public void tellYourName() {
		System.out.println("내 이름은" + name + "입니다");
	}
}

//자식(하위)클래스 : man 클래스를 상속받아 회사원을 추상화.
class BusinessMan extends Man {
	//멤버변수로 회사면, 직급 선언 
	private String company;
	private String position;
	
	/*
	상속받은 자식클래스는 부모클래스의 생성자를 호출하여 부모 인스턴스가
	메모리에 먼저 생성되도록 해야 하낟. super()는 부모클래스의 생성자를 호출한다.
	만약 super()을 기술하지 않으면 컴파일러에 의해 자동으로 삽입되어 
	디폴트 생성자가 호출된다.
	*/
	public BusinessMan(String name, String company, String position) {
		// 부모클래스의 매개변수 1개인 생성자를 호출한다.
		// 남은 2개의 매개변수로 자식 쪽의 멤버변수를 초기화 한다.
		super(name);
		
		this.company = company;
		this.position = position;
		System.out.println("BusunessMan 생성자 호출됨");
	}

	public void tellYourInfo() {
		//자식클래스의 멤버이므로 접근할 수 있다.
		System.out.println("회사명은" + company + "입니다");
		System.out.println("직급은" + position + "입니다");
		/*
		 * 부모클래스의 멤버변수 name은 private으로 선언되었으므로 상속받은 자식클래스에선
		 * 접근할 수 없다. private 멤버는 무조건 클래스 내부에서만 접근가능.
		 */
		//System.out.println("이름은" + name + "입니다"); 오류
		
		/*
		 * 부모클래스에 public으로 선언된 메서드를 통해 간접접근하여 사용 가능.
		 */
		tellYourName();
	}
}

public class E01BusinessManMain {

	public static void main(String[] args) {
		//자식클래스를 통해 2개의 인스턴스를 생성
		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");
		
		//회사정보와 이름 출력
		man1.tellYourInfo();
		//이름만 출력
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}

}
