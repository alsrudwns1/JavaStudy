package ex12inheritance;

/*
 * 구성관계로 표현하기에 적합한 Has-A 관계
 * X has a Y => X가 Y를 소유(포함)하다. 여기서는 권총을 보유한 경찰을 표현.
 * Has - A와 같이 소유의 관계를 상속으로 표현하려면 클래스간의 강한 연결고리가
 * 형성되어 권총이 없는 경찰을 표현하기가 힘들어진다. 이 경우에는 구성(composition)
 * 관계로 표현하는 것이 좋다. 구성관계란 클래스의 멤버로 또다른 클래스를 쓰는 것.
 */

//권총을 추상화. 
class Gun {
	//멤버변수 : 총알
	int bullet;
	//생성자
	public Gun(int bNum) {
		bullet = bNum;
	}
	//총을 발사한 뒤 총알이 감소하는 것을 표현
	public void shutGun() {
		System.out.println("빵야");
		bullet--;
	}
}
//경찰을 추상화
class Police {
	/*
	 * 권총과 수갑을 보유한 경찰을 표현, 상속으로 구현하지 않고 
	 * 멤버변수로 정의하고있다.
	 */
	//수갑: 정수형 멤버변수
	int handCuffs;
	//권총: 인스턴스형 멤버변수(다른클래스를 통해 생성)
	Gun gun;
	
	public Police(int bNum,int hCuff) {
		//수갑은 정수가벗을 통해 보유여부 설정
		handCuffs = hCuff;
		/*
		 * 권총의 보유여부는 총알이 없다면 권총이 없는것으로 간주하여 null로 초기화.
		 * 참조변수가 null을 할당받았다는 것을 참조할 인스턴트가 없음을 의미
		 * 힙영역에 생서된 인스텐스가 ㅇ예 없으므로 소유하지 않은 것을 표현.
		 */
		if(bNum <=0) {
			gun = null;
		}
		else {
			gun = new Gun(bNum);
		}
	}
	
	//수갑 채우기
	public void putHandcuff() {
		System.out.println("수갑채움");
		handCuffs--;
	}
	//권총을 발사하는것을 표현
	public void shut() {
		//조건문을 통해 소유 총이 있을 때만 발사 가능.
		if(gun==null) {
			System.out.println("소유한 권총 없음");
		}
		else {
			gun.shutGun();
		}
		
	}
		
}

public class E05HasAComposite {

	public static void main(String[] args) {
		System.out.println("경찰1");
		Police police1 = new Police(5, 3);
		police1.shut();//발사 가능
		police1.putHandcuff();
		
		//권총을 보유하지 않은 경찰로 수갑

		System.out.println("경찰2");
		Police police2 = new Police(0, 3);
		police2.shut();
		police2.putHandcuff();
		

	}

}
