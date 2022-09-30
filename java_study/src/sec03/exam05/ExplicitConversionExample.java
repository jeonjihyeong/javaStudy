package sec03.exam05;

public class ExplicitConversionExample {
	public static void main(String[] args) {
        double dNum = 5.7;
        float fNum = 1.7f;

        int result1 = (int) dNum + (int) fNum;
        int result2 = (int) (dNum+fNum);
        float result3 = (float) (dNum+fNum);
        double result4 = dNum+fNum;
        System.out.println("result1:"+result1);
        System.out.println("result2:"+result2);
        System.out.println("result3:"+result3);
        System.out.println("result4:"+result4);
	}
}
