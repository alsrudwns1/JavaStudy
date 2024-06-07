package ex05method;

public class QuTemperature {

	public static void main(String[] args) {
		System.out.println("섭씨 28도 > 화씨:" + celsiusToFahrenheit(28));
		System.out.printf("화씨 28도 > 섭씨:%.2f", fahrenheitToCelsius(28));
	}
	
	// 섭씨를 화씨로
	public static double celsiusToFahrenheit(double cel) {
		return 1.8 * cel + 32;
		
	}
	
	// 화씨를 섭씨로
	public static double fahrenheitToCelsius(double fah) {
		double cel = (fah - 32) /1.8;
		return cel;
	}

}
