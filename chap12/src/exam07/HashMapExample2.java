package exam07;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Float> map = new HashMap<String, Float>();		
		//객체 저장
		map.put("손흥민", 9.9f);
		map.put("이강인", 9.7f);
		map.put("김민재", 9.5f);
		
		/* 1. entrySet을 이용한 Map 객체 읽기
		 * - Map에 저장되어 있는 모든 Map.Entry를 Set으로 반환
		 * - key와 value의 집합을 가져온다. */
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("Player: " + entry.getKey() + ", MoM: " 
			                              + entry.getValue() + "점");
		}
		
		/* 2. keySet을 이용한 Map 객체 읽기
		 * - Map에 저장되어 있는 모든 key 객체를 반환 */
		set = map.keySet();
		System.out.println("Player List: " + set);
		
		for (String key : map.keySet()) {
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
		
		/* 3. values을 이용한 Map 객체 읽기
		 * - Map에 저장되어 있는 모든 values 객체를 반환 */
		Collection<Float> values = map.values();	
		
		//총점 계산
		it = values.iterator();
		Float total = 0f;
		
		while (it.hasNext()) {
			Float mom = (Float) it.next();
			total += mom.intValue();			
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + total/set.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최저점수: " + Collections.min(values));		
	}//end of main()
}//end of HashMapExample
