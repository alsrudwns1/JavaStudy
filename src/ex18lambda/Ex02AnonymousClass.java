package ex18lambda;

//2. 익명클래스를 통한 오버라이딩

// 인터페이스 정의 (부모인스턴스로 사용)
interface ISchool2 {
	void studyLambda(String str);
}

public class Ex02AnonymousClass {
	/*
	 * 여기서는 익명클래스를 통해 구현하므로 implements 는 필요치 않다.
	 */

	public static void main(String[] args) {
		/*
		 * ISchools 인터페이스를 구현한 익명클래스를 정의한다.
		 * extends 혹은 implements 키워드가 없지만 중괄호 부분은 자식의
		 * 영역이 된다. 즉 익명클래스는 눈에 보이지 않는 상속이 되어있어
		 * 오버라이딩이 가능하다.
		 */
		
		ISchool2 sch = new ISchool2() {
			/*
			 * 상속의 절차를 익명클래스가 대체하므로 코드가 좀더 간단해짐
			 */
			@Override
			public void studyLambda(String str) {
				System.out.println(str+"을 공부하기 위해 익명클래스만듬");
				
			}
		};
		sch.studyLambda("람다식");

	}

}
