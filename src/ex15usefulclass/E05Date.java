package ex15usefulclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05Date {
	
	/*
	 * calendar 클래스를 통해 얻은 인스턴스를 초로 변환한 후 매개변수로
	 * 전달된 날짜서식으로 변경한 string 을 반환한다.
	 */
	
	public static String myDateFormat (Calendar c, String formatStr) {
		/*
		 * getTime() : 서버의 표준시인 1970-01-10 부터 현재까지의 시간을
		 * 초 단위로 반환. 이를 타임스탬프 라고 한다.
		 */
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
	}

	public static void main(String[] args) {
		
		/*
		 * calendar 클래스는 대표적인 싱글톤 클래스이므로 new로 인스턴스를
		 * 생성할 수 없고, 유틸리티 매서드를 통해 참조값을 얻어와야한다.
		 */
		Calendar calendar = Calendar.getInstance();
		
		/*
		 * 월을 표현하는 month, 분을 표현하는 minute 의 이니셜이 동일하므로
		 * 구분을 위해 월은 대문자, 분은 소문자를 씀
		 */
		String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재1: " + nowStr1);
		
		//그외 여러가지 서식문자가 존재한다.
		String nowStr2 = myDateFormat(calendar, "오늘은 M월의 W번째주, d번째날, "
				+ "F번째 E요일");
		System.out.println("현재2: " + nowStr2);
		
		/*
		 * 현재날짜를 기준으로 전/후를 구하기 위해 add()매서드 사용함.
		 * 음수를 사용하면 과거날짜 구하기 가능
		 */
		calendar.add(calendar.DATE, 3);
		calendar.add(calendar.MONTH, 2);
		calendar.add(calendar.YEAR, 1);
		
		//앞에서 add()를 3번 호출했으므로 결과는 아래와 같이 출력된다.
		String nowStr3 = myDateFormat(calendar, "yyyy년 MM월 dd일");
		System.out.println("1년 2개월 3일 후: " + nowStr3);
		
		/*
		 * 올해 크리스마스까지 남은 날짜를 계산한다. 여기서는 두가지 서식의
		 * 날짜를 파싱하여 구한 날짜인스턴스를 통해 계산한다
		 */
		//오늘날짜 : 0000-00-00 형식
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//크리스마스: 0000/00/00 형식
		String future = "2022/12/25";
		
		long result = myDiffDate(today, future);
		System.out.println(today + "에서 " + future + "까지남은날짜: " + result);
	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			/*
			 * 매개변수를 통해 전달된 2개의 문자열은 날짜의 서식이 서로 다르다.
			 * 따라서 각 날짜의 서식을 명확히 지정해야지만 날짜를 인식하여
			 * 연산할 수 있다.
			 * 아래는 string을 date로 변환한다.
			 */
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
			
			/*
			 * gettime()으로 얻어오는 시간은 13자리인 정수값인데 10자리까지는
			 * 순수한 초(sec)이고, 11~13자리는 밀리세컨즈를 의미한다.
			 * 즉 100으로 나눠서 뒤의 3자리를 제거하면 순수한 초가 된다
			 * 또한 하루는 86400초 이므로 아래와 같이 남은 날짜를 계산 가능.
			 */
			diffDays = (formatFuture.getTime() - formatToday.getTime())
					/ (24*60*60*1000);
		}
		catch (Exception e) {}
		return diffDays;
	}

}
