package ex12inheritance;

/*
 * instanceof 연산자
 * : 인스턴스 변수가 어떤 타입의 변수인지를 판단하는 연산자로 형변환
 * (즉 상속관계가 있으면)이 가능하면 true를 반환한다.
 * 
 * -인스턴스 간에 형변환이 되려면 반드시 두 클래스간에 상속관계가 있어야 함.
 * 
 * -부모타입의 참조변수로 자식 인스턴스를 참조할 수 있으므로 매개변수를
 * 부모타입으로 정의하면 자식 인스턴스를 인수로 받을 수 있다.
 * 
 * -매개변수로 전달되는 인수는 부모타입으로 자동형변환 되므로 정상적인
 * 사용을 위해 강제형변환 해야하는데 이때 확인을 위해 사용된다.
 */

//아래 3개의 클래스는 상속관계이다
class Box {
	public void boxWrap() {
		System.out.println("Box로 포장");
	}
}
class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paperBox로 포장");
	}
}
class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("goldpaperBox로 포장");
	}
}


public class E09InstanceOf {
	
	/*
	매서드 정의 시 부모타입의 매개변수를 설정하면 자식타입의 인스턴스를
	모두 받을 수 있다.
	
	Box타입으로 인수를 받게 되면 자동형변환 되므로 자식클래스의 멤버메서드는
	호출할 수 없게 된다. 이때 자식의 멤버메서드를 호출하기 위해 강제형변환이
	필요하다.
	
	instanceof 연산자를 통해 자식타입으로 형변환이 되는지 판단한 후
	true반환하면 다운캐스팅을 진행한 후 매서드를 호출할 수 있게됨
	 * 
	 */
	
	static void wrapBox(Box b) {
		/*
		 * 세가지 인스턴스 중 어떤게 전달되더라도 box타입으로 자동형변환(업캐스팅)
		 * 되므로 해당 매개변수를 통해 호출할 수 있는 매서드는 boxwrap이 유일함.
		 * 따라서 다운캐스팅(강제형변환)이 필요함
		 */
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox) b).goldWrap();
		}
		else if(b instanceof PaperBox) {
			((PaperBox) b).paperWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
	}

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
		/*
		 * string인스턴스는 box와는 아무런 관계가 없으므로 인수로 전달 불가능
		 * 즉 상속관계가 성립하지 않음
		 */
		String str = new String("나는누구");
		//wrapBox(str);

	}

}
