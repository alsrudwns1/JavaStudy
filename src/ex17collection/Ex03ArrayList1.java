package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
/*
 * ArrayList<E> : list  계열의 컬렉션
 * - 데이터의 중복저장이 허용됨
 * - 데이터의 저장 순서를 보장함
 * - 데이터 접근 시 get() 혹은 interator()를 이용한다.
 * - Array 라는 이름처럼 '배열'의 특성을 갖고있어 index를 통한 저장 및
 * 접근이 가능하다.
 */

import javax.print.DocFlavor.BYTE_ARRAY;

public class Ex03ArrayList1 {

	public static void main(String[] args) {
		
		//string 인스턴스를 저장할 수 있는 list 컬렉션 생성.
		//arraylist 와 나머지 컬렉션들은 데이터를 저장하는 내부적인 자료구조만
		//다를 뿐 사용법은 동일하다.
		ArrayList<String> list = new ArrayList<String>();
		
		
		//LinkedList<String> list = new LinkedList<String>()
		//Vector<String> list = new Vector<String>();
		
		/*
		 * 인스턴스 저장 : add()
		 * add(인스턴스) : 순차적으로 저장하며 인덱스는 0부터 자동부여
		 * add(인덱스 ,인스턴스) : 데이터 저장 시 인덱스를 직접 부여.
		 * 단, 인덱스를 건너뛰면 에러가 발생한다.
		 * 만약 지정한 인덱스에 이미 저장된 인스턴스가 있다면 삽입
		 */
		
		// 객체 저장
		
		list.add("소녀시대");
		list.add("빅뱅");
		list.add("트와이스");
		list.add(3, "워너원");
		//list.add(5, "소방차"); 런타임 에러 발생
		/*
		 * 저장된 객체 수(리스트의 크기) : size()
		 * 컬렉션에 저장된 인스턴스의 갯수를 반환한다. 배열에서 사용하는
		 * length와 동일한 값을 반환한다.
		 */
		list.add(list.size(), "오마이걸");
		list.add(list.size(), "방탄");
		System.out.println("중복 저장 전 객체 수: " + list.size());
		
		
		//중복저장: list는 배열의 특성을 가지므로 데이터를 중복저장 가능.
		//동일한 데이터라도 index로 구분할 수 있기 때문임.
		//add()는 인스턴스 추가에 성공할 경우 true 를 반환
		System.out.println(list.add("트와이스") ? "중복저장됨" : "중복저장안됨");
		System.out.println("중복저장 후 객체 수 : " +list.size());
		
		
		//컬렉션 출력 시에는 아래의 3가지 방법을 사용한다.
		
		//방법 1: 일반 for문 사용. 이때는 인덱스를 통해 접근해야 하므로
		//get()메서드를 사용한다.
		System.out.println("일반 for문 사용");
		for(int i =0; i<list.size() ; i++) {
			System.out.println(list.get(i) + " ");
		}
		
		
		//방법 2: 확장 for문의 경우 인덱스값이 전체 원소를 반복해주므로
		//좀 더 간단한 표현이 가능하다. 가장 많이 쓰이는 방식.
		System.out.println("확장 for 문 사용");
		for(String obj: list) {
			System.out.println(obj + " ");
		}
		
		
		//방법 3 : iterator 사용
		// 1.컬렉션에 저장된 내용을 iterator 객체에게 알려주기 위해
		// 인스턴스를 생성한다.
		// 2. hasNext()로 인출할 인스턴스가 있는지 검사한다. 만약 없다면 false
		// 3. 앞에서 확인 후 next()를 통해 인스턴스 인출
		System.out.println("반복자 iterator 사용");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		System.out.println("============");
		
		//덮어쓰기(수정하기): 기존의 내용을 변경한다. 즉 기존 내용을 지우고
		//새로운 내용으로 갱신한다.
		list.set(4, "오마이걸>덮어쓰기");
		for(Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println("==========");
		
		//삽입하기: add(삽입할 인덱스, 인스턴스)
		//해당 인덱스에 인스턴스를 삽입한다. 기존 인스턴스는 뒤로 1칸씩 밀림
		//즉 인덱싱을 자동으로 해준다.
		list.add(4, "블랙핑크>삽입하기");
		for(Object object : list) {
			System.out.println(object + " ");
		}
		System.out.println("=============");
		
		//포함여부확인 
		//contains(인스턴스) : 특정 인스턴스가 저장되어 있는지 확인할 때 사용.
		//존재한다면 true를 반환
		System.out.println(list.contains("빅뱅") ? "빅뱅있음" : "빅뱅없음");
		System.out.println(list.contains("블랙핑크") ? "블핑있음" : "블핑없");
		
		
		//삭제 1: 인덱스로 삭제
		//remove(인덱스) : 인덱스를 통해 삭제를 진행한 뒤 삭제가 끝나면
		//해당 인스턴스를 반환한다. 삭제 후에는 인덱스가 자동 부여된다.
		//삭제 성공시 해당 인스턴스의 참조값을 반환하므로 즉시 확인 가능.
		Object obj = list.remove(2); //2번 인덱스 '트와이스'삭제 후 반환
		System.out.println("삭제된 객체 : " + obj);
		
		
		//삭제 2: indexof를 통해 해당 인스턴스의 인덱스를 찾은 뒤 삭제
		//인덱스를 찾는 것을 제외하면 삭제1과 동일한 방법이다.
		int index = list.indexOf("빅뱅");
		System.out.println("빅뱅의 인덱스 = " + index);
		list.remove(index);
		
		
		//삭제 3 : 인스턴스의 참조값을 통해 삭제한다. 이 경우에는
		//삭제에 성공했을 때 true를 반환한다. 즉 boolean타입의 반환값을 가짐.
		System.out.println(list.remove("방탄") ? "삭제성공" : "삭제실패");
		
		//저장된 인스턴스가 없으므로 삭제에 실패한다.
		System.out.println(list.remove("오마이걸") ? "삭제성공" : "삭제실패");
		System.err.println("삭제 후 출력");
		for(Object object : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
		
		//전체삭제: 아래 2개의 메서드를 통해 컬렉션에 저장된 전체 데이터를
		//삭제할 수 있다.
		list.removeAll(list);
		list.clear();
		System.out.println("전체삭제 후 객체 수:" + list.size());
	}

}
