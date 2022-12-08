package sec01.exam01;

public class CalculatorMain {
	public static void main(String[] args) {
		int result = 0;
		result = Calculator.add(1,2);
		result = Calculator.sub(1,2);
		result = Calculator.mul(1,2);
		try {
			result = Calculator.div(3,0);
		}catch(DivideException e) {
			e.printStackTrace();
		}
	}
}