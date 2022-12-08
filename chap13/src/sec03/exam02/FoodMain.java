package sec03.exam02;

public class FoodMain {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		
		Apple apple = new Apple("사과");
		Orange orange = new Orange("오렌지");
		Basil basil = new Basil("바질");
		
		fruitBox.add(apple);
		fruitBox.findAll();
		
		fruitBox.add(orange);
		fruitBox.findAll();
	}
}
