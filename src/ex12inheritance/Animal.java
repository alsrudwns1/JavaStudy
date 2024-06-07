package ex12inheritance;

public class Animal {
	private String species;
	int age;
	public String gender;
	
	//생성자
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	//현재 상태
	public void showAnimal() {
		System.out.println("종:" + species);
		System.out.println("나이:" + age);
		System.out.println("성별:" + gender);
	}
	
	/*
	 * getter메서드
	 * :private로 선언된 멤버변수를 클래스 외부로 반환할 때 사용하는 매서드
	 */
	public String getSpecies() {
		return species;
	}
	
}
