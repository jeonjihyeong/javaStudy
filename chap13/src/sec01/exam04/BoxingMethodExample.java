package sec01.exam04;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println("intValue:"+intValue);
		
		Box<String> box2 = Util.boxing("손흥민");
		String strValue = box2.get();
		System.out.println("strValue:"+strValue);
	}
}
