package ex03operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {
		
		/*
		 * 하나의 조건검사만으로 결과를 알 수 있는 경우, 뒤의 조건을 검사하지 않는다
		 * 이 경우 변수의 값이 변경되는 코드가 있다면 실행되지 않으니 주의할것
		 */
		
		int num1= 0, num2 = 0;
		boolean result;
		
		//num1에 10을 더한 값을 num1에 넣음
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+ num2);
		
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result="+result);
		System.out.println("num1="+num1+", num2="+ num2);

	}

}
