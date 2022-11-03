package step01.util;

import java.util.Scanner;

public class InputUtil {
	private Scanner scanner;
	
	public InputUtil() {
		this.scanner = new Scanner(System.in);
	}
//	입력 받은 값을 반환하는 메소드
	public String getValue(String label) {
		// TODO Auto-generated method stub
		System.out.print(label+": ");//그룹 Name (0.홈으로):
		//키보드로 입력한 문자열 전체를 가져오기
		String inputStr = scanner.nextLine();
		//inputStr = inputStr.trim();//\r,\n 공백 제거(\0020 이하값제거)
		inputStr = inputStr.strip();//\r, \n 공백 제거(유니코드 공백 모두 제거)
		
		//입력값 반환
		return inputStr;
	}

}
