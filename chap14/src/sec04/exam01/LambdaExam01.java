package sec04.exam01;

@FunctionalInterface
interface Calculable{
	int sum(int x, int y);
}

public class LambdaExam01 {
	public static void main(String[] args) {
		Calculable calc;
		
		calc = new Calculable() {
			@Override
			public int sum(int x, int y) {
				return x+y;
			}
		};
		System.out.println(calc.sum(3, 7));
		
		calc = (int x, int y)->{
			return x+y;
		};
		System.out.println(calc.sum(3, 7));
		
		calc = (x,y)->{
			return x+y;
		};
		System.out.println(calc.sum(3, 7));
		
		calc = (x,y)->x+y;
		
		System.out.println(calc.sum(3, 7));
	}
}
