package sec03.exam01.polymorphism.step03;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		for (int i = 0; i< animals.length;i++) {
			int num = (int) (Math.random()*3);
			System.out.println(num);
			
			if(num ==0) {
				animals[i]= new Human();
			}else if (num ==1) {
				animals[i]= new Tiger();
			}else {
				animals[i]= new Eagle();
			}
		}
		for(Animal animal: animals) {
			animal.move();
		}
	}
}
