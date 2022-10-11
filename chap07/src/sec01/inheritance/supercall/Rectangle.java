package sec01.inheritance.supercall;

public class Rectangle extends Shape{
	public Rectangle() {
		System.out.println("생성자 호출: Rectangle()");
	}
	
	@Override
	public void draw() {
		System.out.println("자식 draw() 메서드 호출");
	}
}
