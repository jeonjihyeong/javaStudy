package sec01.exam04;

public class VIPCustomer extends Customer{
	private int specialMP;
	
	public VIPCustomer() {
		customerGrade ="VIP";
		agentID = 901;
		mileageRatio = 0.05;
		discountRate = 0.1;
		
		System.out.println("VIPCustomer () 생성자 호출");
	}

	public int getSpecialMP() {
		return specialMP;
	}

	public void setSpecialMP(int specialMP) {
		this.specialMP = specialMP;
	}
	
	@Override
	public int calcMileagePoint(int price) {
		mileagePoint += ((price *mileageRatio)+getSpecialMP());
		return mileagePoint;
	}

//	public void setCustomerName(String customerName) {
//		
//		
//	}
}
