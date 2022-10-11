package sec01.exam04;

public class CustomerExam {
	
	public static void main(String[] args) {
		SILVERCustomer silver = new SILVERCustomer();
		silver.setCustomerID(1001);
		silver.setCustomerName("손흥민");
		silver.calcMileagePoint(100000);
		System.out.println(silver.customerInfo());
		
		VIPCustomer vip = new VIPCustomer();
		vip.setCustomerID(1002);
		vip.setCustomerName("이강인");
		vip.setSpecialMP(10000);
		vip.calcMileagePoint(100000);
		System.out.println(vip.customerInfo());
	}
}
