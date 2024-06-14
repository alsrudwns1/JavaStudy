package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet<E> : set계열의 컬렉션
 * -set 계열의 인터페이스를 구현한 컬렉션
 * -인스턴스가 순서 없이 저장됨
 * -인스턴스의 중복저장을 허용하지 않음.
 * -기본클래스(string, integer)인 경우 별도처리 없이 중복이 제거됨
 * -개발자가 정의한 클래스라면 hashCode(), equals()매서드를 적절히
 * 오버라이딩 해야만 중복 제거 가능.
 * -list가 배열의 특성을 가진다면 set은 집합의 특성을 가짐.
 */

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		/*
		 * object를 기반으로 set 컬렉션을 생성했으므로 모든 인스턴스를
		 * 저장할 수 있다.
		 */
		
		HashSet<Object> set = new HashSet<Object>();
		
		//아래 2개의 문장도 위와 동일한 인스턴스 생성 문장으로 사용 가능
		//HashSet<Object> set = new HashSet< >();
		//HashSet set = new HashSet();
		
		/*
		 * 3가지의 기본 클래스와 우리가 정의한 teacher 클래스의 인스턴스 생성
		 */
		String varString1 ="JAVA";
		String varString2 =new String("개발자");
		Date varDate = new Date();
		int varInt = 100; //저장 시 integer로 boxing 됨
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		//객체저장: add()를 통해 저장하고, 성공 시 true 반환
		System.out.println("add결과:" + set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		//size()를 통해 저장된 인스턴스 갯수 출력 : 5개 출력됨
		System.out.println("중복 저장 전 객체 수: " + set.size());
		
		//기본클래스의 객체 중복저장
		//: 기본클래스인 경우 별도의 오버라이딩 없이도 중복이 제거됨
		// 따라서 아래의 add()메서드는 false 반환
		System.out.println(set.add(varString2) ? "저장성공" : "저장실패");
		System.out.println("중복 저장 후 객체 수: " + set.size());
		
		//이터레이터를 통한 객체출력 : 순서없이 저장되므로 출력 순서도 못정함
		//1. set 참조변수를 통해 iterator 인스턴스 생성
		Iterator itr = set.iterator();
		//2. 인출할 인스턴스가 있는지 확인
		while(itr.hasNext()) {
			//3. true가 반환되면 next()를 통해 인출한다.
			Object object = itr.next();
			/*
			 * HashSet<E>에 저장 시 모두 Object형으로 자동형변환되어 저장되므로
			 * 우리가 직접 정의한 클래스에 대해서만 instaceof를 통해 타입을
			 * 확인한 후 다운캐스팅 하여 출력한다.
			 * 만약 다운캐스팅을 하지 않으면 자식멤버에 접근할 수 없으므로
			 * getName()을 호출할 수 없다.
			 */
			if(object instanceof Teacher) {
				System.out.println("teacher객체=>" + ((Teacher)object).getName());
			}
			else {
				System.out.println("저장된 객체:" + object);
			}
		} // while 끝
		
		//포함 여부 확인: set에 해당 인스턴스가 있는지 확인한다.
		System.out.println(set.contains(varString1) ? "varstring1 있음" : "없음");
		
		//객체 삭제 : 인스턴스 참조값을 통해 삭제한다.
		System.out.println(set.remove(varString2) ? "varstring2삭제성공" : "실패");
		
		//전체삭제 : list 컬렉션과 동일
		set.clear();
		System.out.println("전체삭제:" + set.removeAll(set));
		System.out.println("전체 삭제 후 객체 수:" + set.size());
		

	}

}
