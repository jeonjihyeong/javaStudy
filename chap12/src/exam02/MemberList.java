package exam02;

import java.util.ArrayList; 
import java.util.Iterator;

public class MemberList {
	 // mList 필드(Member 타입의 객체를 저장할 수 있는 ArrayList 선언)
	private ArrayList<Member> mList; 

	//생성자
	public MemberList(){
		// mList 필드 초기화
		mList = new ArrayList<Member>();  
	}
	
	//ArrayList 에 멤버 추가
	public void addMember(Member member){  
		mList.add(member);
	}
	
	// memberId로 멤버 삭제 후 삭제 여부(true/false)를 반환
	public boolean removeMember(int memberId){  
		//for문으로 삭제(방법1)
//		for(int i =0; i<mList.size(); i++){ 
//			// mList에서 인덱스에 해당하는 멤버 객체 가져오기
//			Member member = mList.get(i);
//			
//			//memberId 가져오기 
//			int tempId = member.getMemberId();
//			
//			if(tempId == memberId){ //멤버아이디가 일치하면 
//				mList.remove(i); // 해당 멤버를 삭제
//				return true; // true 반환
//			}
//		}
	
		//iterator를 이용하여 멤버 삭제(방법2)
		Iterator<Member> ir = mList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();			
			int tempId = member.getMemberId();
			
			if(tempId == memberId){ // 멤버아이디가 일치하면 
				mList.remove(member); // 해당 멤버를 삭제
				return true;              // true 반환
			}
		}

		// 일치하는 memberId가 없는 경우
		System.out.println(memberId + "가 존재하지 않습니다");  
		return false;                   
	}//end of removeMember()
	
	//mList있는 전체 회원 출력 메서드
	public void findAll(){
		for(Member member : mList){
			System.out.println(member);
		}
		System.out.println();
	}
}
