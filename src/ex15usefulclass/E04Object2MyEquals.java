package ex15usefulclass;

/*
 * equals() 메서드
 * -자바에서 인스턴스의 내용 비교를 위해 비교연산자(==)를 사용하는 것은
 * 단순히 참조값에 대한 비교를 하는 것이므로, 실제 내용에 대한 비교가
 * 이뤄지지 않는다.
 * 
 * -인스턴스간의 내용 비교를 위해선 equals()를 통해 각 클래스에 맞게
 * 오버라이딩 하여 사용해야 한다.
 * 
 * - string 과 같은 기본클래스는 별도의 오버라이딩 없이도 내용비교가 가능.
 */

class IntNumber {
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	
	/*
	 * equals() 메서드가 어떻게 인스턴스간의 내용을 비교하는지 설명하기
	 * 위한 메서드를 정의
	 */
	//비교를 위해 IntNumber 타입의 인스턴스를 매개변수로 받은 후..
	public boolean myEquals(IntNumber numObj) {
		//전달된 인스턴스의 멤버변수와 값을 비교하여..
		if(this.num == numObj.num) {
			//값이 동일하면 true를 반환하고..
			return true;
		} 
		else {
			//틀리면 false를 반환한다.
			return false;
		}
	}
}

public class E04Object2MyEquals {

	public static void main(String[] args) {
		/*
		 * string과 같은 기본클래스는 별도의 오버라이딩 없이도 내용비교 가능
		 */
		String str1 = new String("자바개발자");
		String str2 = "자바개발자";
		
		if(str1.equals(str2)) {
			System.out.println("같은문자열입니다");
		}
		else {
			System.out.println("다른문자열입니다");
		}
		
		//정의한 클래스를 통해 인스턴스를 생성
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		/*
		 * 개발자가 직접 정의한 myEquals()메서드를 통해 인스턴스간
		 * 내용비교를 한다.
		 */
		
		if(num1.myEquals(num2)) {
			System.out.println("num1과 num2는 동일한 정수");
		}
		else {
			System.out.println("num1과 num2는 다른 정수");
		}
		
		/*
		 * 인스턴스간의 비교를 할 때엔 단순히 참조변수에 대한 비겨를 하면 
		 * 안되고, 실제 내용에 대한 비교를 해야한다.
		 */
		
		if(num1.myEquals(num3)) {
			System.out.println("num1과 num3는 동일한 정수");
		}
		else {
			System.out.println("num1과 num3는 다른 정수");
		}

	}

}
