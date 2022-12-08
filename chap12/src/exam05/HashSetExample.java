package exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class HashSetExample {
	public static void main(String[] args) {
		//로또번호 3개 생성
		lottoGnerator(3);
	}

	//lotto 번호 생성 메서드(static)
	public static void lottoGnerator(int n) {
		//랜덤 숫자를 만들기 위해 Random 객체 생성
		Random number = new Random();
		
		//Integer 타입의 값을 저장하는 HashSet 타입의 참조변수 선언 
		HashSet<Integer> lotto = null;
		
		//인자로 받은 n개의 HashSet 객체 생성
		for (int i = 0; i < n; i++) {
			//HashSet 객체 생성
			lotto = new HashSet<Integer>();
			
			//HashSet에 저장되는 숫자의 개수많큼 반복(로또번호는 6개)
			for (int j = 0; lotto.size() <= 5; j++) {
				//1~45사이의 정수 중 임의의 수 하나를 선택하여 반환된 값을 HashSet에 저장
				int num = number.nextInt(45)+1;
//				if (lotto.contains(num)) {
//					System.out.println("lotto 번호 중복" + num);
//					continue;
//				}
				lotto.add(num);//중복된 값은 저장안됨
			}

			//Set은 정렬할 수 없기 때문에 HashSet인 lotto를 초기값을 갖는 ArrayList 생성
			List<Integer> lottoNum = new ArrayList<Integer>(lotto);
			
			//Collections.sort() 메서드는 인자로 전달된 List의 값을 오름차순으로 정렬
			Collections.sort(lottoNum);
			System.out.println((i+1) + ": " + lottoNum);
		}
	}
}
