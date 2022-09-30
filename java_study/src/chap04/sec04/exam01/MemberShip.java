package chap04.sec04.exam01;

public enum MemberShip{
	PLATINUM_MEMBER(30),ROYAL_MEMBER(20),GOLD_MEMBER(10),SILVER_MEMBER(5);
	
	private int discountRate;
	
	private MemberShip(int discountRate) {
		this.discountRate = discountRate;
		System.out.println("생성자 호출:"+this);
	}
}