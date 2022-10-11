package sec01.inheritance.supercall;

public class Shape {
	public Shape() {
		System.out.println("생성자 호출: Shape()");
	}
	public void draw() {
		System.out.println("부모 draw() 메서드 호출");
	}
}
