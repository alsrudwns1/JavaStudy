package ex07string;

/*
 * StringBuffer 클래스
 * :String 클래스는 기존 문자열에 새로운 문자열을 추가하면 새롭게 생성된
 * 메모리에 저장한다. 기존 메모리가 소멸되고 새로운 매모리가 생성되는 낭비를
 * 막기 위해 문자열의 변경이 많은 경우 스트링버퍼를 쓰는것이 좋다.
 * 기존 메모리를 변경하고 부족한 경우 자동으로 확장한다.
 */

public class E03StringBuilderBuffer {

	public static void main(String[] args) {
		
		//append(값) : 문자열의 끝에 새로운 값을 연결한다.
		//insert(인덱스, 값) : 지정한 인덱스에 값을 삽입한다.
		
		//인스턴스 생성
		StringBuffer strBuf = new StringBuffer("AB");
		
		//정수 연결
		strBuf.append(25);
		
		//문자열이나 boolean 값도 연결 가능
		strBuf.append("Y").append(true);
		System.out.println("strBuf=" + strBuf);
		
		//인덱스 2에 false 삽입
		strBuf.insert(2,  false);
		
		// 문자열의 길이를 통해 마지막 부분에 추가
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf=" + strBuf);
		
		System.out.println("string 과 stringbuffer의 " + "참조값비교");
		//더블쿼테이션으로 동일한 문자열을 생성하므로 동일한 주소값을 가짐
		String str1 = "Java&jsp";
		String str2 = "java & jsp";
		if(str1==str2)
			System.out.println("연결전:주소값동일");//출력
		else
			System.out.println("연결전:주소값다름");
		
		//String 은 변경이 있는 경우 기존 메모리를 소멸한 후 새로운 메모리를 할당.
		str1 = str1 + "&Spring";
		if(str1==str2)
			System.out.println("연결후:주소값동일");
		else
			System.out.println("연결후:주소값다름");
		
		/*
		 * 스트링버퍼는 문자열을 저장하기 위해 기본 메모리를 16으로 할당한다.
		 * 차후 저장공간이 부족하다면 자동으로 메모리를 확장한다.
		 */
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기=" + buf.length());
		System.out.println("기본버퍼크기=" + buf.capacity());
		
		buf.append("자바공부중");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기=" + buf.length());
		System.out.println("기본버퍼크기=" + buf.capacity());
		
		buf.append("금일은 스트링버퍼 학습중");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기=" + buf.length());
		System.out.println("기본버퍼크기=" + buf.capacity());

	}

}
