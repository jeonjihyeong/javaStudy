package sec01.inheritance.abstracts;

public class Parrot extends Bird{
	@Override
	public void eat() {
		System.out.println("앵무새는 사료를 먹는다.");
	}
	@Override
	public void sound() {
		System.out.println("앵무새는 사람의 소리를 흉내낸다.");
	}
}
