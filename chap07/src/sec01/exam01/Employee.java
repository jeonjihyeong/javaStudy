package sec01.exam01;

public class Employee extends Person{
//	private String name;
//	private int age; 상속으로 삭제
	private String dept;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	} 상속으로 삭제
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
