package sec01.inheritance.abstracts;

public class Cat extends Mammal{
	@Override
	public void eat() {
		System.out.println("고양이는 사료를 먹는다.");
	}
	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 운다.");
	}
}
