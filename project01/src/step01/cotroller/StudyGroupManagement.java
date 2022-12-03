package step01.cotroller;

import step01.entity.StudyGroup;
import step01.util.InputUtil;

public class StudyGroupManagement {
	private InputUtil inputUtil;
	
//	ManagementService 인터페이스 타입의 참조 변수 선언
//	private ManagementService managementService;
	
	public StudyGroupManagement() {
		this.inputUtil =new InputUtil();
	/* managementService 필드 초기화
	 * -managementService 인터페이스를 구현한 ManagementServiceLogic() 객체 생성
	 * ManagementService 인터페이스 타입의 참조변수에 구현 객체 저장(Up-casting)
	 * 
	 */
	//this.managementService = new ManagementServiceLogic();
	}
	//스터디 그룹 등록
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("[등록 작업]");
		System.out.println("============================");
		
		while(true) {
			String name = inputUtil.getValue(">스터디 Name (0.홈으로)");
			if(name.equals('0')) {return;}
			
			String topic = inputUtil.getValue(">스터디 Topic (0.홈으로)");
			if(topic.equals("0")) {return;}
			
			String period = inputUtil.getValue(">스터디 Period (0.홈으로)");
			if(period.equals("0")) {return;}
			
			String room = inputUtil.getValue(">스터디 Room (0.홈으로)");
			if(room.equals("0")) {return;}
			
			String save = inputUtil.getValue(">등록하시겞습니까?(9.등록, 0.홈으로");
			
			if(save.equals("9")) {
				StudyGroup newGroup = new StudyGroup(name,topic,period,room);
			}
		}
	}

	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	public void findById() {
		// TODO Auto-generated method stub
		
	}

	public void findByName() {
		// TODO Auto-generated method stub
		
	}

	public void modify() {
		// TODO Auto-generated method stub
		
	}

	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
