package sec03.exam02;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
	private List<T> fList;
	
	public FruitBox() {
		fList = new ArrayList<>();
	}
	
	public void add(T fruit) {
		fList.add(fruit);
	}
	
	public void findAll() {
		for(T fruit: fList) {
			System.out.println(fruit);
		}
	}
}
