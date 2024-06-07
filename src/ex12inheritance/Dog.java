package ex12inheritance;

public class Dog extends Animal {
	public String dogKind;
	public String name;
	
	public Dog(String species, int age, String gender, String dogKind, String name) {
		//부모 클래스인 animal 먼저 호출
		super(species, age, gender);
		//초기화
		this.dogKind = dogKind;
		this.name = name;
	}
	
//	private으로 선언되지 않은 경우
//	public void bark() {
//		System.out.println("이름이 " + name + " 이고, 종이 " + species + " 인 강아지가 짖는다" );
//	}
	
	//멤버변수가 private로 선언되면 직접 접근이 안되므로 getter를 통해 값을 반환받는다.
	//animal 의 species가 private로 선언되어있음
	public void bark() {
		System.out.println("이름이 " + name + " 이고, 종이 " + getSpecies() + " 인 강아지가 짖는다" );
	}
	
	public void showDog() {
		System.out.println("강아지 이름: " + name );
		System.out.println("강아지 나이: " + age );
		System.out.println("강아지 성별: " + gender );
		System.out.println("강아지 종: " + dogKind );
		
	}
	
	
}
