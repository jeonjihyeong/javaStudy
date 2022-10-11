package sec01.inheritance.abstracts;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Eagle eagle = new Eagle();
		Parrot parrot = new Parrot();
		
		Mammal[] mammals = new Mammal[] {dog,cat};
		
		Bird[] birds = new Bird[] {eagle, parrot};
		
		Animal[] animal = new Animal[] {
				dog,cat, eagle, parrot
		};
		for (Animal ani: animal) {
			ani.eat();
			ani.sound();
		}
		System.out.println("===================");
		
		for (Mammal mam: mammals) {
			mam.eat();
			mam.sound();
			mam.character();
		}
		
		System.out.println("===================");
		
		for (Bird bird: birds) {
			bird.eat();
			bird.sound();
			bird.character();
		}
	}
}
