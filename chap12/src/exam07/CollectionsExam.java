package exam07;

import java.util.*;
import static java.util.Collections.*;

public class CollectionsExam {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		System.out.println(list);
		
		addAll(list, 1, 2, 3, 4, 5);
		System.out.println(list);
		
		rotate(list, 1);//오른쪽으로 1칸씩 이동
		System.out.println(list);
		
		swap(list, 1, 2);//인덱스 1번 요소와 2번 요소 교환
		System.out.println(list);
		
		shuffle(list);//저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder());//내림차순 정렬
		System.out.println(list);
		
		sort(list);//오름차순 정렬
		System.out.println(list);
		
		System.out.println("max: " + max(list));//최대값
		System.out.println("min: " + min(list));//최소값
		
		//list 크기의 새로운 newList를 만들어 7로 채운다.
		List newList = nCopies(list.size(), 7);
		System.out.println(newList);
		
		copy(list, newList);//list에 newList 요소 복사
		System.out.println(newList);
		
		fill(list, 0);//모든 요소를 0으로 채운다
		System.out.println(list);		
	}
}
