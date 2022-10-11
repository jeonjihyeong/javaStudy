package sec01.exam04;

public class SILVERCustomer extends Customer{
	public SILVERCustomer() {
		customerGrade = "SILVER";
		agentID = 101;
		mileageRatio = 0.01;
		discountRate = 0.05;
		
		System.out.println("SIlVERCustomer() 생성자 호출");
	}
	
	@Override
	public int calcMileagePoint(int price) {
		return super.calcMileagePoint(price);
	}
}
