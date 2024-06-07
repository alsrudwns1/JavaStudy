package ex08class;

//과일판매자
class FruitSeller {
	
	//멤버 변수
	//판매자의 보유수량
	int numOfApple = 100;
	//판매 수익금
	int myMoney = 0;
	//멤버 상수
	final int APPLE_PRICE = 1000;
	/*
	 * 멤버변수의 경우 초기값이 없는 상태로 정의한 다음 인스턴스를 생성하고
	 * 차후 초기화 할수 있다.
	 * 하지만 멤버상수는 인스턴스 생성과 상관없이 정의하는 시점에 반드시 초기화
	 * 해야 한다. 즉 1000을 지우면 에러가 발생함.
	 */
	
	//멤버메서드 : 매개변수로 받은 money만큼의 사과갯수를 반환
	public int saleApple(int money) {
		//금액을 단가로 나눠서 갯수를 계산
		int num = money / APPLE_PRICE;
		//보유한 사과에서 갯수만큼 차감
		numOfApple -= num;
		//금액합산
		myMoney += money;
		//사과의 갯수 반환. 즉 구매자에게 사과 전달
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과 갯수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}
//과일 구매자
class FruitBuyer {
	int myMoney = 5000;
	int numOfApple = 0;
	
	/*
	 * 구매자가 판매자에게 사과를 구매하는 행위를 표현
	 */
	
	public void buyApple(FruitSeller seller, int money) {
		//판매자가 반환해주는 사과의 갯수를합산
		numOfApple += seller.saleApple(money);
		//지불한 금액을 차감한다.
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]잔액:" + myMoney);
		System.out.println("[구매자]사과 갯수:" + numOfApple);
	}
}

public class E06FruitSalesMain1 {

	public static void main(String[] args) {
		
		/*
		 * 판매자와 구매자의 인스턴스 생성. 여기서 우리가 생성자를 만들지 않았으므로
		 * 자동으로 생성되는 디폴트 생성자를 통해 인스턴스 생성.
		 */
		
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();

		System.out.println("구매행위가 일어나기 전 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		//구매자가 판매자에게 5000원 주고 사과 삼
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
