package ex09package;


//각 클래스는 반드시 public 으로 선언해야 임포트 할 수 있다.
import ex09package.study.seller.FruitSeller4;
import ex09package.study.buyer.FruitBuyer4;


public class E03FruitSalesMain4 {

	public static void main(String[] args) {
		
		/*
		 * 생성자를 사용해 인스턴스를 생성하면 아래와 같이 생성과 동시에
		 * 초기화까지 할 수 있다. 따라서 초기화 매서드를 사용하는 것 보다 간단한
		 * 코드로 작성할 수 있는 장점이 있음
		 */
		
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);	
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);

		System.out.println("구매행위가 일어나기 전 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불하고 사과를 구매한다.
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
	}

}
