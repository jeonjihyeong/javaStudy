package step01.view;

import java.util.Scanner;

import step01.controller.StudyGroupManagement;
//스터디그룹을 관리를 위한 메뉴 클래스
public class StudyGroupMenu {
//	스캐너 객체 참조변수 선언
	Scanner scanner;
//스터디그룹을 관리하는 StudyGroupManagement manage 객체의 참조벼수 선언	
	private StudyGroupManagement manage;
//	생성자
	public StudyGroupMenu() {
//		스캐너 필드 초기화 (키보드로 부터 입력받기 위함)
		this.scanner = new Scanner(System.in);
//		manage 필드 초기화 (스터디 그룹을 관리 하는 객체 생성)
		this.manage=new StudyGroupManagement();
	}
//	메뉴에서 작업을 선택하고 해당 작업을 수행하는 메소드를 호출
//	1. 작업 menu 출력, 작업선택
//	2. 해당 작업을 수행하는 메소드 호출
	public void showMenu() {
		int selectNum=0;
		
		while(true) {
			displayMenu();
			
			selectNum=selectMenu();
			//작업메뉴에 따른 작업 메소드 호출
			switch(selectNum) {
			case 1:
				manage.register();
				break;
			case 2:
				manage.findAll();
				break;
			case 3:
				manage.findById();
				break;
			case 4:
				manage.findByName();
				break;
			case 5:
				manage.modify();
				break;
			case 6:
				manage.remove();
				break;
			case 0:
				System.out.println(">작업을 종료합시다.");
				return;
			default:
				System.out.println(">번호를 다시 입력하세요");
			}
		}
	}
	
	private void displayMenu() {
		System.out.println("...........................");
		System.out.println("[스터디그룹 HOME] 메뉴를 선택하세요");
		System.out.println("...........................");
		System.out.println("[1] 등록");
		System.out.println("[2] 검색(All)");
		System.out.println("[3] 검색(Id)");
		System.out.println("[4] 검색(Name)");
		System.out.println("[5] 수정(Id)");
		System.out.println("[6] 삭제(Id)");
		System.out.println(".............................");
		System.out.println("[0] 종료");
		System.out.println(".............................");
		
	}
	
	private int selectMenu() {
		System.out.print("Select: ");
		//키보드로 입력한 작업메뉴 번호 가져오기
		int menuNum = scanner.nextInt();
		
		if(menuNum>=0&&menuNum<=6) {
//			키보드로 입력한 문자열 전체를 가져오기
			scanner.nextLine();//버퍼(버퍼에 있는 \r (carriage Return(13) \n(Line Feed(10))값 등)
			return menuNum;//작업메뉴 반환
		}else {
			System.out.println("입력 번호를 확인바랍니다:"+menuNum);
			return -1;//실패 리턴값
		}
	}
}
