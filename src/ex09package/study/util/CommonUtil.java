package ex09package.study.util;

public class CommonUtil {
	
	/*
	 * 매개변수로 전달된 문자열을 검사하여 숫자가 아닌 문자가 포함된 경우에는
	 * false 를 반환하고, 모두 숫자인 경우 true 반환
	 */
	
	public static boolean isNumber(String strValue) {
		
		/*
		 * 전달된 문자열이 빈 문자열이라면 검사의 필요가 없으므로
		 * 즉시 false 반환
		 */
		if(strValue.length()==0)
			return false;
		//문자열의 길이만큼 반복
		for(int i=0; i<strValue.length(); i++) {
			//각 인덱스에 해당하는 문자의 아스키코드값을 얻어옴
			int acode = strValue.codePointAt(i);
			/*
			 * 아스키코드를 통해 숫자형식인지 확인하고, 만약 범위를 벗어났다면
			 * false 반환함. 숫자가아닌 문자가 포함된 경우 false가 반환됨
			 */
			if( !(acode>='0' && acode <='9')) {
				return false;
			}
		}
		return true;
	}

}
