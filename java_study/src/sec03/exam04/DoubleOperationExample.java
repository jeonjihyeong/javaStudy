package sec03.exam04;

public class DoubleOperationExample {
	public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.5;

        double result = intValue + doubleValue;
        System.out.println("result : " + result);

        int result2 = intValue + (int) doubleValue;
        System.out.println("result2 : " + result2);
	}


}
