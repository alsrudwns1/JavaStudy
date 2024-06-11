package ex13interface.figure;

/*
 * 원은 반지름만 있으면 넓이를 구할 수 있으니까 figuredata 클래스는 상속안함
 */

public class Circle implements IFigure, IDrawable {
	// 멤버변수: 반지름
	int radius;
	// 생성자 
	public Circle(int radius) {
		this.radius = radius;
	}
	 //2개의 인터페이스를 구현했으므로 추상메서드를 필수적으로 오버라이딩 해야함
	@Override
	public void draw(String figureName) {
		System.out.println(figureName + "을 그립니다");
	}
	@Override
	public void area(String figureName) {
		/*
		 * Math.PI: Math 클래스의 static 상수로 원주율을 얻어올 수 있다.
		 */
		System.out.println(figureName + "의 면적(r*r*PI):" + radius*radius*Math.PI);
		
	}
}
