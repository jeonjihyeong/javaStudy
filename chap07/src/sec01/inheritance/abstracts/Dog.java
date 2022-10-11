package sec01.inheritance.abstracts;

public class Dog extends Mammal{
	@Override
	public void eat() {
		System.out.println("개는 사료를 먹는다.");
	}
	@Override
	public void sound() {
		System.out.println("개는 멍멍 짖는다.");
	}
}
