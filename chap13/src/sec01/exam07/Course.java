package sec01.exam07;

public class Course<T> {
	private String cName;
	private T[] students;
	
	public Course(String cName, int capacity) {
		this.cName = cName;
		
		students = (T[]) new Object[capacity];
	}
	
	public String getcName() {
		return cName;
	}
	
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i =0; i<students.length;i++) {
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
}
