package ex12inheritance;

/*
 * 가변인자(Variable Argument)
 * :매서드 오버로딩을 대체할 수 있는 문법으로 하나의 매서드로 여러 호출형식을
 * 대체할 수 있다.
 * 
 * 형식]
 * 매서드명(자료형...매개변수명) {
 * 		실행문장;
 * }
 * -필요에 따라 매개변수를 가변적으로 조정할수 있는 문법.
 * -매개변수로 2개이상의 인수를 받을 수 있어야하므로 배열로 반환
 * -단 자료형은 모두 동일
 */

public class E08VariableArgument {
	
	//앞에서 학습한 메서드 오버로딩을 통한 메서드 정의(여러개는 못만듬)
	static int getTotal(int param) {
		int total = 0;
		total += param;
		return total;
	}
	static int getTotal(int param1, int param2) {
		int total = 0;
		total+= (param1 + param2);
		return total;
	}
	static int getTotal(int param1, int param2, int param3) {
		int total = 0;
		total+= (param1 + param2 + param3);
		return total;
	}
	/*
	 * ...을 통해 매개변수 param이 2개이상의 인수를 받을 수 있는 것을 명시.
	 * 또한 매서드 내에서는 배열로 반환되어 "매개변수명.length"와 같이 코딩 가능.-
	 */
//	static int getTotal(int ... param) {
//		int total = 0;
//		for(int i =0; i < param.length; i++) {
//		total += param[i];
//		}
//		return total;
//	}
	

	public static void main(String[] args) {
		System.out.println("getTotal(args1)호출:" + getTotal(10));
		System.out.println("getTotal(args1, args2)호출:" + getTotal(10, 20));
		System.out.println("getTotal(args1, args2, args3)호출:" + getTotal(10, 20, 30));
		
		//System.out.println("getTotal(매개변수 6개)호출:" + getTotal(10,2,3,4,5,6));
		//System.out.println("getTotal(args1, args2)호출:" + getTotal(10, 20.3));

	}

}
