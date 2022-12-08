package exam05;

import java.util.*;

class User {
	int ssn; // 생년월일
	String name; //이름

	User(int ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return ssn + ":" + name;
	}

	@Override
	public int hashCode() {
		/* hashCode()는 해시 알고리즘에 의해 생성된 고유의 정수값을 반환 
		   - Objects.hash(Object... values)// 가변인자(객체를 구분하기 위한 필드) */
		return Objects.hash(name, ssn);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)//객체의 주소값이 같으면
//			return true;
//		if (obj == null)//객체의 주소값이 null이면
//			return false;
//		if (getClass() != obj.getClass())//클래스가 다르면 
//			return false;
		
		if (!(obj instanceof User)) return false;
		
		//현재객체(this)와 다른 객체의 필드를 비교하기 위해 Casting
		User other = (User) obj;
		return Objects.equals(name, other.name) && ssn == other.ssn;
	}
}//end of User class

public class HashSetExample2 {
	public static void main(String[] args) {
		User u1 = new User(901011, "손흥민");
		//User u2 = new User(901011, "이강인");
		User u2 = new User(901011, "손흥민");
		User u3 = new User(890123, "김민재");

		System.out.println(u1.equals(u2));

		//HashSet 컬렉션 생성
		HashSet<User> users = new HashSet<User>();
		//컬렉션에 객체 추가
		users.add(u1);
		users.add(u2);
		users.add(u3);

		//Iterator를 통해 컬렉션에 있는 객체 출력(반복)
		Iterator<User> iter = users.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}//end of HashSetExample2
