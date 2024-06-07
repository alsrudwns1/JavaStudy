package ex05method;

public class QuFindPrimeNumber {
	
	public static boolean isPrimeNumber(int n) {
		
		// 1은 소수가 아니므로 확인할 필요도 없이 false
		if(n ==1)
			return false;
		
		// 만약 7이라면 1과 7로 나눠떨어지므로 확인이 필요 없다
		// 2~6까지만 나눠보면 되므로 n-1 까지만 확인한다.
		for(int x = 2; x <= n-1; x++) {
			// 만약 나눠떨어지는것이 발견되었다면 이미 소수가 아니므로
			// 뒷부분은 확인할 필요가 없다
			if(n % x == 0) {
				 return false;
			}
			
		}
		// 위 반복문을 벗어났다면 소수이므로 true 반환
		return true ;
	}

	public static void main(String[] args) {
		// 1~100까지의 정수 중 소수인지 판단하기 위해 반복호출
		for(int i = 1; i<= 100; i++) {
			// 소수인지 판단하여 boolean 을 반환받음
			boolean result = isPrimeNumber(i);
			// 소수인 경우에만 콘솔에 출력함
			if(result == true) {
				System.out.println("소수 = "+ i);
			}
		}

	}

}
