package chap05.sec05.exam04.singleton.before;

public class MyAppExam {
	public static void main(String[] args) {
		System.out.println("[FirstPage]");
		new FirstPage().setAndPrintSettings();
		
		System.out.println("[SecondPage]");
		new SecondPage().setAndPrintSettings();
	}
}
