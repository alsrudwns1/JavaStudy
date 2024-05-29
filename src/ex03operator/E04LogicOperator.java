package ex03operator;

public class E04LogicOperator {

	public static void main(String[] args) {
		
		int num1= 10, num2 = 20;
		
		// && = 양쪽 모두가 true 일때만 true를 반환
		boolean result1 = (num1==100 && num2==20);
		// || = 한쪽이라도 true 면 true 반환
		boolean result2 = (num1<12 || num2>= 30);
		
		System.out.println("result1의결과:" + result1);
		System.out.println("result2의결과:" + result2);
		
		// ! = 항상 반대의 논리를 반환함
		if(!(num1==num2)) {
			System.out.println("넘원 넘투 다름");
		}
		else {
			System.out.println("넘원 넘투 같음");
		}

	}

}
