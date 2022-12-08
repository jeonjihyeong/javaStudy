package exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		//for문을 이용한 데이터 반복처리
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//error
		}

		System.out.println("==============");

		/* Iterator를 이용한 데이터 반복처리
		 * iterator() 메서드는 컬렉션 객체를 Iterator 객체로 변환하여 반환
		 * 모든 List, Set 계열의 컬렉션 객체를 Iterator 객체로 변환하여 사용 가능  */
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {//읽어올 요소가 있는지 확인
			System.out.println(iter.next());//요소를 읽어옴
		}
	}
}
