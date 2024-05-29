package ex03operator;

public class E02BokhapOperator {

	public static void main(String[] args) {
		
		/*
		 * 복합대입연산자: 산술연산자와 대입연산자를 연결해놓은 형태로 좌우측 값을 연산,
		 * 좌측의 변수에 대입하는 구조를 지님.
		 * 문법구조상 항상 현재의 타입을 유지함.
		 */
		
		double e = 3.1;
		// e 에 2.1을 더한 결과를 e 에 삽입하라
		e += 2.1;
		System.out.println("e의 결과값:" + e);
		e *= 2;
		System.out.println("e의 결과값:" + e);
		e += e;
		// 변수 e에 값이 누적됨
		System.out.println("e의 결과값:" + e);
		
		int n = 5;
		
		//정수와 실수 연산 시 실수의 결과가 나오므로 n에 대입 불가능. 에러발생
		//n = n * 2.7;
		
		//위 구문을 정상적 처리하기 위해 강제형변환
		n = (int)(n * 2.7);
		
		//복합대입연산자 사용 시 문법구조상 기존 자료형을 유지하는 특성이 있다.
		//따라서 연산의 결과는 정수가 된다
		n *=2.7;
		System.out.println("n의 결과값:" +n);
		

	}

}
