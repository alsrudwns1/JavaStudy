package ex05method;

/*
 * 지역변수
 * -변수는 사용범위를 가지고 있고, 해당 지역에서만 쓸 수 있다.
 * 해당 지역을 벗어나면 즉시 메모리에서 소멸됨
 * 기본자료형은 스택이라는 메모리를 씀
 * stack 은 입구가 하나만 있는 컵과 같은 형태이며 선입후출의 특성을 지님
 * 또한 스택은 cpu가 메모리의 생성 및 소멸을 주관한다
 */

public class E06LocalVariable {

	public static void main(String[] args) {
		
		boolean scope = false;
	
		
		/*
		 * main 지역에서 num을 선언하면 그보다 좁은 지역인 if문에서는 같은이름의
		 * 변수를 선언할 수 없다. 큰 지역에서 이미 선언되어 메모리에 저장됐기 때문/
		 */
		//int num = 9; 주석처리 안하면 아래에서 에러가 나게된다.
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫 if문 지역:" + num);
		}
		else {
			int num = 5;
			System.out.println("첫 if문의 else 지역:" + num);
		}
		int num = 100;
		System.out.println("메인 메소드 지역:" + num);
		
		simpleFunc()
;
		System.out.println("메인메소드 끝");
	}
	/*
	 * main 지역에서 선언한 변수 num은 메모리에 아직 ㅇ상주하고 있지만
	 * 해당 메서드는 크기가 동일한 다른 지역에 정의되었으므로
	 * 같은 이름의 변수를 선언할 수 있다.
	 * main 메서드의 if~else문의 블럭도 같은 개념으로 변수를 선언한 것
	 */
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple메소드 지역:" + num);
	}
 
}
