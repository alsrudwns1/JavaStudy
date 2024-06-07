package ex08class;

public class Human {
	
	/*
	 * 멤버변수: 객체의 속성 표시
	 * 나이의 경우 산술연산이 필요치 않다면 String 으로 설정해도 된다.
	 * 에너지는 증감연산 필요하므로 int
	 */
	
	String name;
	int age;
	int energy;
	
	// 멤버 메서드: 객체의 동작을 표현
	void walking() {
		energy--;
		if(energy <0) {
			energy = 0;
			System.out.println("[walk]에너지는 0이 최소입니다");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[walk]에너지가 1 감소하였습니다.");
		}
	}
	void thinking() {
		energy -= 2;
		if(energy <0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다");
			System.out.println("0으로 고정됩니다.");
		}
		else {
			System.out.println("[thinking]에너지가 2 감소하였습니다");
		}
	}
	void eating() {
		energy+=2;
		if(energy >10) {
			energy = 10;
			System.out.println("[eat]에너지는 0이 최대입니다");
		}
		else {
			System.out.println("[eat]에너지가 2 증가하였습니다.");
		}
	}
	void showState() {
		System.out.println("현재 상태");
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("에너지" + energy);
		
	}

}
