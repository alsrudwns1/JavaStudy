package ex18lambda;

//1.인터페이스와 클래스를 활용한 가장 일반적인 오버라이딩
/*
 * 이와 같이 추상클래스를 아래에 있는 인터페이스로 변경 가능.
 * 인터페이스에 정의된 메서드는 public abstract가 자동 추가됨.
abstract class ISchool1 {
	public abstract void studyLambda(String str);
}
*/

/*
 * 인터페이스 정의
 * : 인터페이스에는 추상메서드만 정의할 수 있다. 구현부가 없는 메서드이므로
 * 기능을 가질 수 없고, 오직 오버라이딩의 목적으로만 사용된다. 
 */
interface ISchool1 {
	void studyLambda(String str);
}


/*
 * 추상메서드를 포함한 인터페이스를 구현하면 하위 클래스에서는 반드시 
 * 오버라이딩 해야한다. 추상메서드를 포함한 클래스는 반드시 abstract로 선언하거나
 * 그렇지 않으면 오버라이딩을 통해 부모 인터페이스의 추상메서드를 재정의 해야함.
 */
class Student1 implements ISchool1 {
	@Override
	public void studyLambda(String str) {
		System.out.println(str + "을 공부함");
	}
}

public class Ex01NormalClass {

	public static void main(String[] args) {
		/*
		 * 단지 매서드 하나를 정의해서 사용하고 싶은데 인터페이스, 상속,
		 * 오버라이딩, 인스턴스 생성까지의 과정을 거쳐야 하므로 너무 복잡함.
		 * 
		 * 여기서는 부모타입의 참조변수를 통해 인스턴스를 생성한 뒤 오버라이딩된
		 * 자식쪽의 메서드를 호출하고 있다.
		 * 
		 */
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");
	}

}
