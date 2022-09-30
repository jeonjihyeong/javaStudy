package sec01.exam06;

public class ranNumberGenerator {
	public static void main(String[] args) {
		int randomMonth = (int) (Math.random()*12)+1;
		int day;
		switch(randomMonth) {
			case 1,3,5,7,8,10,12:
				day = 31;
				break;
			case 4,6,9,11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
		}
		System.out.println("월은 일까지입니다.");
	}
}
