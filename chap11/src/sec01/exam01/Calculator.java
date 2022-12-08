package sec01.exam01;

public class Calculator {


	public static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	public static int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public static int mul(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	public static int div(int i, int j) throws DivideException{
		// TODO Auto-generated method stub
		if (j==0) {
			throw new DivideException();
		}
		return i/j;
	}

	
}
