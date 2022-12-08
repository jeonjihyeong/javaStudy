package exam02;

public class MemberMain {

	public static void main(String[] args) {

		MemberList memberList = new MemberList();
		//멤버 객체 생성
		Member m1 = new Member(1001, "손흥민");
		Member m2 = new Member(1002, "이강인");
		Member m3 = new Member(1003, "김민재");
		Member m4 = new Member(1004, "아이유");
		
		//멤버 추가
		memberList.addMember(m1);
		memberList.addMember(m2);
		memberList.addMember(m3);
		memberList.addMember(m4);
		
		memberList.findAll();
		
		System.out.println("삭제할 id: " + m3.getMemberId());
		memberList.removeMember(m3.getMemberId());
		
		memberList.findAll();
	}
}

