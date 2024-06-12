package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E06LocalDateTime {

	public static void main(String[] args) {
		
		//날짜를 표현
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘날짜:" + localDate);
		
		//시간을 표현
		LocalTime localTime = LocalTime.now();
		System.out.println("현재시간:" + localTime);
		
		//날짜와 시간을 동시에 표현
		LocalDateTime monent = LocalDateTime.now();
		System.out.println("지금:" + monent);
		
		//날짜와 시간의 서식을 지정
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		DateTimeFormatter format3 = DateTimeFormatter.
				ofPattern("오늘은 M월의 W번째 주, d번째 날, F번째 E요일");
		
		//앞에서 지정한 서식을 날짜에 적용해서 출력
		System.out.println("서식1: " + monent.format(format1));
		System.out.println("서식3: " + monent.format(format2));
		System.out.println("서식2: " + monent.format(format3));
		
		//특정날짜 지정하기 : localdate.of(년,월,일);
		LocalDate xMas = LocalDate.of(localDate.getYear(), 12, 25);
		//앞에서 지정했던 날짜서식을 적용해 출력
		System.out.println("크리스마 : " + xMas.format(format1));
		
		/*
		 * period 클래스 : 두 날짜 사이의 간격을 나타냄. ?개월 ?일 
		 * 남음으로 표시할 수 있다.
		 */
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths() + "개월" + period.getDays() + "일 남음");
		
		//ChronoUnit 클래스 : 특정 시간 단위로 날짜차이 계산
		// ?개월 남음 : 남은 개월수 표시
		System.out.println(ChronoUnit.MONTHS.between(localDate, xMas) + "개월남음");
		
		//남은 전체 일수를 표시
		System.out.println(ChronoUnit.DAYS.between(localDate, xMas) + "일 남음");
		
		//현재를 기준으로 이전/이후의 날짜 계산
		System.out.println("5일 전:" + monent.minusDays(5));
		System.out.println("3일 후:" + monent.plusDays(3));
		System.out.println("2개월 후:" + monent.plusMonths(2));
		System.out.println("1년 후:" + monent.plusYears(1));
		
		//메서드 체인 형태로 호출할 수 있다.
		System.out.println("1년 2개월 3일 후:" + monent.plusYears(1).plusMonths(2).plusDays(3));
		

	}

}
