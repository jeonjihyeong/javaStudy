package exam02;

public class Member {

	private int mId;      //회원 아이디
	private String mName; //회원 이름

	public Member(int memberId, String memberName){ 
		this.mId = memberId;
		this.mName = memberName;
	}
	
	public int getMemberId() {  
		return mId;
	}
	public void setMemberId(int memberId) {
		this.mId = memberId;
	}
	public String getMemberName() {
		return mName;
	}
	public void setMemberName(String memberName) {
		this.mName = memberName;
	}
	
	@Override
	public String toString(){   
		return mName + " 회원님의 아이디는 " + mId + "입니다";
	}
	
}
