package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * HaspMap<K ,V> : Map<T> 인터페이스를 구현한 컬렉션
 * - Key,Value의 쌍으로 인스턴스를 저장.
 * - Key 값은 중복 불가. 만약 중복 시 덮어씀
 * - Key값으로 검색되므로 다른 컬렉션에 비해 속도가 빠름.
 * - 저장 순서 유지 x
 */

public class Ex06HashMapMain {

	public static void main(String[] args) {
		//Map컬렉션 생성. Key와 Value를 모두 string 으로 선언
		HashMap<String, String> map = new HashMap<String, String>();
		
		//객체저장 : 저장 시 기존에 저장된 동일한 key값이 존재하면
		//저장된 인스턴스가 반환된다. 만약 처음 입력이라면 null을 반환.
		//처음 저장이므로 null이 반환된다.
		System.out.println("name이란 키값으로 저장된 이전의 값: " +
				map.put("name", "홍길동"));
		
		//int 즉 Integer는 String으로 형변환이 불가능하므로 타입에러가 발생.
		int number = 20;
		//map.put("age", number);
		//정수는 아래와 같이 문자열로 변경한 후 저장 가능.
		map.put("age", String.valueOf(number));
		map.put("gender", "남");
		map.put("address", "가산디지털단지");
		//현재까지 4개의 데이터가 저장된다.
		System.out.println("저장된객체수:" + map.size());
		
		
		//중복저장: 기존에 입력된 key값 name이 이미 있으므로 '홍길동'이 반환.
		//그리고 기존의 값은 '최길동'으로 수정됨
		System.out.println("name이라는 키값으로 저장된 이전의 값: " 
					+ map.put("name", "최길동")); // 덮어쓰기
		//중복저장되므로 4개 출력
		System.out.println("키값으로 중복저장후 객체수:" + map.size());
		
		//출력하기 1. 키값을 알고있을때 : get(key값)으로 출력한다.
		System.out.println("키값알때:" + map.get("name")); //최길동
		
		//출력하기 2. 키값을 모를때(혹은 너무 많아서 하나씩 명시가 힘들 때)
		//:keySet()메서드를 통해 전체 key를 set컬렉션으로 얻어온다.
		//해당 반환값을 확장 for문으로 반복하고, 이를 통해 value를 친출할 수 있다.
		Set<String> keys = map.keySet();
		System.out.println("확장 for문 적용");
		for(String key : keys) {
			//get(key값)을 통해 value를 출력한다.
			String value = map.get(key);
			System.out.println(String.format("%s,%s", key, value));
		}
		
		//3. 이터레이터를 통한 출력 : 이터레이터를 통해 출력할때도 keyset을 통해
		//key를 먼저 얻어온 후 반복 출력한다.
		System.out.println("이터레이터 쓰기");
		//map의 전체 key를 얻어온 후
		Set<String> keys2 = map.keySet();
		//얻어온 key를 통해 이터레이터 인스턴스 생성
		Iterator<String> it = keys2.iterator();
		//key가 있는지 확인한 후 
		while (it.hasNext()) {
			//존재하면 key를 인출한다.
			String key = it.next();
			//key를 통해 value를 인출한다.
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key,value));
		}
		
		//value만 얻어와야 할 때
		
		System.out.println("value값들만 출력하기");
		/*
		 * value만 얻어올 때는 values()매서드를 통해 값 인출 가능.
		 * 확장 for문을 통해 출력한다. 
		 */
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		//존재유무 확인 : map컬렉션은 key와 value가 있으므로 매서드도 2개로
		//나눠져있다.
		System.out.println(map.containsKey("name") ? 
				"name키값 있다" : "name키값 없다");
		System.out.println(map.containsKey("account") ? 
				"account키값 있다" : "account키값 없다");
		System.out.println(map.containsKey("남자") ? 
				"남자 있다" : "남자 없다");
		System.out.println(map.containsKey("여자") ? 
				"여자 있다" : "여자 없다");
		
		//인스턴스 삭제 : key를 통해 삭제하고, 삭제 성공 시 해당 value 반환
		System.out.println("삭제된 객체:" + map.remove("age"));
		System.out.println("age키값을 삭제 후 출력");
		for(String key : keys) {
			System.out.println(String.format("%s:%s" , key, map.get(key)));
		}
		
		//전체삭제: removeAll()은 없고, clear()만 사용 가능.
		map.clear();
		System.out.println("전체삭제 후 객체 수:" + map.size());
 
	}

}
