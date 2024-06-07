/*
 * 패키지선언부: 현재 작성하는클래스의 위치를 결정하기 위한 선언.
 * 해당클래스를 특정패키지 하위에 묶어 정의하겠단 뜻
 */
package ex09package;

/*
 * 임포트 선언부: 현재 작성중인 클래스에 다른 패키지에서 선언된 클래스를 가져다가
 * 쓰기 위한 선언, 사용할 클래스의 위치를 지정하는 것으로 생각하면 됨.
 */
import java.util.Date;

import ex09package.study.util.CommonUtil;

//클래스 선언부: 우리가 구현할 내용을 작성한다.
public class E01PackageMain {

	public static void main(String[] args) {
		/*
		 * 하나의 클래스에서 패키지는 다르나 같은 이름의 클래스를 사용해야 한다면..
		 * 방법1: 클래스명 앞에 풀 패키지 경로 기술
		 * 2: 하나의 클래스는 import 하고, 다른 하나는 풀패키지 경로 사용
		 */
		
		Date utilDate = new Date();
		System.out.println("utilDate=" + utilDate);
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate=" + sqlDate);
		
		/*
		 * 개발자가 직접 정의한 클래스도 패키지가 다른 경우에는
		 * 상단에 import 선언 후 사용해야한다.
		 */
		String strValue = "987654321";
		/*
		 * static 으로 선언된 메서드는 new를 통해 인스턴스 생성 없이 클래스명으로
		 * 직접 호출할 수가 있다. 자바에서 제공하는 클래스 중 대표적으로 math 클래스가 있다.
		 * 난수 생성을 위해 Math.random()을 호출함.
		 */
		boolean isNum = CommonUtil.isNumber(strValue);
		
		if(isNum == true) 
			System.out.println("문자열은 숫자입니다");
		else
			System.out.println("숫자가 아닙니다.");
		
		System.out.println(ex09package.study.util.CommonUtil.isNumber("백20"));

	}

}
