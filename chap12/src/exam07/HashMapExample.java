package exam07;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, String> map = new HashMap<String, String>();		
		//객체 저장
		map.put("sony", "1234");
		map.put("ugkang", "12345");
		map.put("sony", "5678");//키가 중복되면 마지막에 저장된 값을 대체
		System.out.println("총 Entry 수: " + map.size());//총 Entry 수 얻기
		System.out.println("=======================");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Id, password를 입력하시요" );
			System.out.print("Id: ");
			String id = scanner.nextLine().trim();
			
			System.out.print("Password: ");
			String password = scanner.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println("Id가 존재하지 않습니다. 다시 입력하세요.");
				continue;
			}
			
			if (!(map.get(id).equals(password))) {
				System.out.println("Password가 존재하지 않습니다. 다시 입력하세요.");
			} else {
				System.out.println("id와 password가 맞습니다.");
				break;
			}
		}//end of while
	}//end of main()
}//end of HashMapExample
