package sec01.exam03;

public class CustomerExam {
	public static void main(String[] args) {
		Customer customer_1=new Customer(1001, "손흥민");
		customer_1.calcMileagePoint(100000);
		
		System.out.println(customer_1.customerInfo());
	}
}
