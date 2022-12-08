package exam05;

import java.util.*;

public class HashSetExample3 {
	public static void main(String[] args) {
		Set<String> hashSetA = new HashSet<>();		
		hashSetA.add("5");
		hashSetA.add("1");
		hashSetA.add("3");
		hashSetA.add("2");
		hashSetA.add("4");
		System.out.println("hashSetA: " + hashSetA.toString());
				
		Set<String> hashSetB = new HashSet<>();		
		hashSetB.add("3");
		hashSetB.add("7");
		hashSetB.add("5");
		hashSetB.add("4");
		hashSetB.add("6");
		System.out.println("hashSetB: " + hashSetB);
		
		/* 합집합(Sum Of Sets) 구하기 
		 * - 집합 hashSetA와 hashSetB의 원소를 합한 것 */
		Set<String> sumOfSets = new HashSet<>();	
		
		//hashSetA의 iterator 객체 얻어오기
		Iterator<String> it = hashSetA.iterator();
		while(it.hasNext()) {
			//hashSetA의 iterator 객체에 있는 모든 요소를 sumOfSets 컬렉션에 추가
			sumOfSets.add(it.next());
		}
		
		//hashSetB의 iterator 객체 얻어오기
		it = hashSetB.iterator();
		while(it.hasNext()) {
			//hashSetB의 iterator 객체에 있는 모든 요소를 sumOfSets 컬렉션에 추가
			sumOfSets.add(it.next());
		}		
	    System.out.println("hashSetA와 hashSetB의 합집합: " + sumOfSets);	    
	    //============================================================
	    
	    /* 차집합(Difference Of Sets) 구하기 
		 * - 집합 hashSetA에 속하고, hashSetB에는 속하지 않는 원소 전체 */
		Set<String> differenceOfSets = new HashSet<>();	
		
		//hashSetA의 iterator 객체 얻어오기
		it = hashSetA.iterator();
		while(it.hasNext()) {
			//hashSetA의 iterator 객체에 있는 요소를 tmp에 저장
			String tmp = it.next();
			
			//tmp가 hashSetB에 없으면 differenceOfSetS 컬렉션에 추가
			if (!hashSetB.contains(tmp)) {
				differenceOfSets.add(tmp);
			}
		}
	    System.out.println("hashSetA와 hashSetB의 차집합: " + differenceOfSets);
	    //============================================================
	    
	    /* 교집합(Intersection) 구하기 
		 * - 집합 hashSetA와 hashSetB에 동시에 속하는 원소 */
		Set<String> intersection = new HashSet<>();	
		
		//hashSetB의 iterator 객체 얻어오기
		it = hashSetB.iterator();
		while(it.hasNext()) {
			//hashSetB의 iterator 객체에 있는 요소를 tmp에 저장
			String tmp = it.next();
			
			//tmp가 hashSetA에 있으면 intersection 컬렉션에 추가
			if (hashSetA.contains(tmp)) {
				intersection.add(tmp);
			}
		}
	    System.out.println("hashSetA와 hashSetB의 교집합: " + intersection);
	    //============================================================
	    
	    //hashSetA와 hashSetB의 합집합
	    hashSetA.addAll(hashSetB);//모든 요소 추가(중복 요소 제외)
	    System.out.println("hashSetA와 hashSetB의 합집합: " + hashSetA);	
	    
	    //hashSetA와 hashSetB의 차집합
	    //hashSetA.removeAll(hashSetB);//공통 요소 삭제
	    //System.out.println("hashSetA와 hashSetB의 차집합: " + hashSetA);	
	    
	    //hashSetA와 hashSetB의 교집합
	    //hashSetA.retainAll(hashSetB);//공통된 요소만 남기고 삭제
	    //System.out.println("hashSetA와 hashSetB의 교집합: " + hashSetA);	
	}
}//end of HashSetExample3
