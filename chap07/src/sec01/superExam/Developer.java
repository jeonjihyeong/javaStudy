package sec01.superExam;

public class Developer extends Employee{
	private double salary;
	
	public Developer(String id, String name) {
		super(id, name);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
