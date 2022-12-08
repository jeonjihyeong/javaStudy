package sec01.exam01;

public class DivideException extends Exception{
	@Override
	public String getMessage() {
		return "제수가 0이기 때문에 예외가 발생하였습니다.";
	}
}
