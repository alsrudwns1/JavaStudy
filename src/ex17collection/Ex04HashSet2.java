package ex17collection;

import java.util.HashSet;

import common.Teacher;

public class Ex04HashSet2 {

	public static void main(String[] args) {
		
		//Teacher 인스턴스를 저장할 수 있는 set 생성
		HashSet<Teacher> hashSet = new HashSet<Teacher>();
		
		//Teacher 인스턴스 생성
		Teacher t1 = new Teacher("정우성", 40, "국어");
		Teacher t2 = new Teacher("황정민", 42, "영어");
		Teacher t3 = new Teacher("최민식", 44, "수학");
		
		//set 에 추가. 모두 3개 저장됨
		hashSet.add(t1);
		hashSet.add(t2);
		hashSet.add(t3);
	
		System.out.println("hashset의 크기: " + hashSet.size());
		
		// 4번째 인스턴스를 생성한다. 시나리오상 t1과 동일한 인스턴스이다.
		Teacher t3Same = new Teacher("이정재", 40, "국어");
		
		/*
		 * teacher 클래스에 오버라이딩을 하지 않으면 동일한 인스턴스인지
		 * 판단할 수 없어 정상적으로 입력됨.
		 */
		System.out.println("t3Same 저장여부:" + hashSet.add(t3Same));
		System.out.println("hashset의 크기:" + hashSet.size());

	}

}
