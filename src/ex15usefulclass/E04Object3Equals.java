package ex15usefulclass;

class Myclass {
	//멤버변수 생성자
	int data;
	public Myclass (int data) {
		this.data = data;
	}
	/*
	 * tostring() : 인스턴스가 가진 데이터를 string 으로 반환해줌
	 * print()가 호출될때 자동으로 호출되어 출력에 도움줌
	 */
	@Override
	public String toString() {
		//정수를 string 으로 변환해서 반환한다
		return "data=" + String.valueOf(data);
	}
	/*
	 * myclass 인스턴스간의 내용비교를 위해 equals()를 오버라이딩하여 재정의.
	 * 인스턴스가 가진 멤버변수의 값에 대한 비교를 통해 동일여부 판단.
	 * equals()매서드의 매개변수 타입은 모든 인스턴스를 대상으로 하므로
	 * object형으로 정의되어있다.
	 */
	@Override
	public boolean equals(Object obj) {
		/*
		 * 매개변수로 전달된 인스턴스를 object로 받으면 업캐스팅이 되므로 
		 * 다운캐스팅 이후에 비교를 진행해야 한다.
		 * 이때 전달된 인스턴스가 myclass 타입이 아니라면 비교의 대상이
		 * 될 수 없으므로 상속관계 확인을 위해 instanceof 연산자를 쓴다.
		 */
		if(obj instanceof Myclass) {
			/*
			 * 매개변수가 myclass 타입이 맞다면 비교를 위해 다운캐스팅한다.
			 * 그렇지 않으면 부모타입으로는 자식멤버에 접근할 수 없으므로
			 * 멤버변수 data에 대한 비교가 불가능해진다.
			 */
			Myclass mc = (Myclass)obj;
			//멤버변수의 값을 비교하여..
			if(mc.data == this.data) {
				//값이 동일하면 true 반환
				System.out.println("myclass - 멤버 동일함");
				return true;
			}
			else {
				//다르면 false 반환
				System.out.println("myclass - 멤버다름");
				return false;
			}
		}
		else {
			/*
			 * 매개변수로 전달된 인스턴스가 myclass 타입이 아니라면
			 * 비교의 대상이 될 수 없으므로 false 반환
			 */
			System.out.println("myclass 객체아님");
			return false;
		}
	}
}

public class E04Object3Equals {

	public static void main(String[] args) {
		
		//클래스를 통해 2개의 인스턴스 생성
		Myclass mc1 = new Myclass(10);
		Myclass mc2 = new Myclass(10);
		
		System.out.println("두 객체를 비교연산자 통해 비교");
		//해당 비교는 참조값에 대한 비교이므로 다른다는 결과가 출력된다.
		if(mc1==mc2) {
			System.out.println("인스턴스 참조값(주소값)이 같다");
		}
		else {
			System.out.println("인스턴스 참조값(주소값)이 다르다다");
		}
		
		/*인스턴스의 내용을 비교하므로 같다고 출력된다
		 * 만약 오버라이딩 한 equals()를 삭제한 뒤 실행하면 다른다는
		 * 결과가 출력된다. 즉 오버라이딩이 필요 없는 경우는 기본클래스일때만 가능
		 */
		System.out.println("두 객체를 eqauls 메소드로 비교");
		System.out.println(mc1.equals(mc2) ? "같다" : "다르다");
		
		/*
		 * print()를 통해 출력하면 자동으로 tostring()을 호출하므로
		 * 아래의 출력 결과는 동일함
		 */
		System.out.println("두 객체의 tostring()메소드 호출");
		System.out.println("mc1.tostring()=>" + mc1.toString());
		System.out.println("mc2=>" + mc2);
	}

}
