package sec01.exam04;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int mileagePoint;
	protected double mileageRatio;
	protected int agentID;
	protected double discountRate;
	
	public Customer() {
		System.out.println("Customer() 생성자 호출");
	}
	
	public int calcMileagePoint(int price) {
		mileagePoint +=price *mileageRatio;
		return mileagePoint;
	}
	
	public String customerInfo() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("[고객 정보]");
		builder.append("\n" +customerName+"님의 등급은 ");
		builder.append(customerGrade).append("이며");
		builder.append("\n마일리지 점수는 ").append(mileagePoint).append("입니다");
		
		return builder.toString();
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getMileagePoint() {
		return mileagePoint;
	}

	public void setMileagePoint(int mileagePoint) {
		this.mileagePoint = mileagePoint;
	}

	public double getMileageRatio() {
		return mileageRatio;
	}

	public void setMileageRatio(double mileageRatio) {
		this.mileageRatio = mileageRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
}
