package ex17collection;

//과일을 추상화한 클래스 생성
class Apple {
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo() {
		System.out.println("사과의 무게는 " + weight + "입니다");
	}
}

class Banana {
	int sugar;
	public Banana(int s) {
		sugar = s;
	}
	public void showInfo() {
		System.out.println("바나나의 당도는 " + sugar + "입니다");
	}
}

/*
 * class FruitBox{
 * Object item;
 * public FruitBox(Object item) {
 * this.item = item;
 * }
 * public void store(Object item) {
 * this.item = item;
 * }
 * public Object pullOut() {
 * return utem;
 * } => 기존 object 기반의 fruitbox를 아래와 같이 제네릭 클래스로 변환.
 * 자료형에 해당하는 부분을 타입 매개변수로 교체하고, 인스턴스 생성 시
 * 자료형을 결정하기 위해 클래스명 <T>형태로 변경한다.
 */


class GenericFruitBox<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class Ex02GenericClass {

	public static void main(String[] args) {
		
		/*
		 * box인스턴스를 생성할 때 T부분을 결정하므로 구현의 편의성이 보장됨.
		 * 각각 사과 ,바나나 인스턴스를 저장할 수 있는 인스턴스가 생성됨
		 */
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
		
		GenericFruitBox<Banana> bananaBox = new GenericFruitBox<Banana>();
		bananaBox.store(new Banana(20));
		Banana banana = bananaBox.pullOut();
		banana.showInfo();
		
		//오렌지 클래스는 동일한 패키지에 정의되었으므로 사용가능하다.
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
		
		/*
		 * 오렌지박스는 인스턴스 생성 시 오렌지를 저장할 수 있는 용도로
		 * 생성되었으므로 다른 인스턴트는 아예 저장할 수 없다.
		 * 아래 코드에서는 컴파일 에러가 발생하므로 자료형에도 안전한
		 * 코드가 된다.
		 */
		//orangeBox.store("나는 오렌지");
		//orangeBox.store(apple);
		//orangeBox.store(banana);


	}

}