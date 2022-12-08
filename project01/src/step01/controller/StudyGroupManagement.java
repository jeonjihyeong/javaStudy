package step01.controller;

import step01.entity.StudyGroup;
import step01.service.ManagementService;
import step01.service.logic.ManagementServiceLogic;
import step01.util.InputUtil;

//스터디그룹 등록, 조회, 수정, 삭제의 요청작업과 결과를 출력하는 클래스
public class StudyGroupManagement {

	//입력작업을 진행할 InputUtil 객체 필드 선언
	private InputUtil inputUtil;

	//[1]ManagementService 인터페이스 타입의 참조 변수 선언
	private ManagementService managementService;

	public StudyGroupManagement() {
		//inputUtil 필드 초기화(입력작업을 진행할 InputUtil 객체 생성)
		this.inputUtil = new InputUtil();

		/* [2]managementService 필드 초기화
		 * - ManagementService 인터페이스를 구현한 ManagementServiceLogic() 객체 생성
		 * - ManagementServic 인터페이스 타입의 참조변수에 구현 객체 저장(Up-casting)
		*/
		this.managementService = new ManagementServiceLogic();
	}
	
	//스터디 그룹 등록
	public void register() {
		System.out.println("[등록 작업]");
		System.out.println("===========================================");
		
		/* 스터디그룹 등록에 필요한 name, topic, period, room 필드값을 입력받아 
		 * 객체를 생성한 후, 배열에 저장을 ManagementService 인터페이스를 통해
		 * ManagementServiceLogic에 요청
		*/
		while(true) {
			/* 사용자로부터 필드값을 입력받음
			 * - 입력 작업은 InputUtil 객체의 getValue() 메서드를 이용
			*/
			
			//스터디명
			String name = inputUtil.getValue(">스터디 Name (0.홈으로)");
			if (name.equals("0")) { return; }

			//스터디주제 
			String topic = inputUtil.getValue(">스터디 Topic (0.홈으로)");
			if (topic.equals("0") ) { return; }
			
			//스터디기간 
			String period = inputUtil.getValue(">스터디 Period (0.홈으로)");
			if (period.equals("0") ) { return; }
			
			//스터디 공부방 
			String room = inputUtil.getValue(">스터디 Room(0.홈으로)");
			if (room.equals("0") ) { return; }
			
			//스터디 그룹 저장 여부 
			String save = inputUtil.getValue(">등록하시겠습니까?(9.등록, 0.홈으로)");
			
			if (save.equals("9") ) { 
				//스터디그룹 생성 및 저장
				StudyGroup newGroup = new StudyGroup(name, topic, period, room);

				/* [3]ManagementService 인터페이스에게 생성된 스터디그룹을 배열에 저장할 것을 요청
				 * - ManagementService 인터페이스를 구현한 ManagementServiceLogic 객체의 
				 *   register() 메소드를 이용해 생성한 스터디그룹을 배열에 저장 
				 */
				managementService.register(newGroup);
				
				System.out.println("===========================================");
				System.out.println(">>스터디그룹 등록: " + newGroup.toString());	
				System.out.println("===========================================");
			} else {
				System.out.println("==> 스터디그룹 등록을 취소했습니다. ");
				return;
			}
		}
	}
	
	//검색(전체)
	public void findAll() {
		System.out.println("검색(All) 작업");
		
		/* ManagementService 인터페이스에 스터디그룹 전체를 검색할 것을 
		 * 요청(findAll() 호출)하여 반환값을 findGroups에 저장 
		*/		
		StudyGroup[] findGroups = managementService.findAll();
		
		//등록된 스터디그룹이 없으면 종료
		if (findGroups.length == 0) { 
			System.out.println("등록된 스터디그룹이 없습니다.");
			return; 
		}
		
		//검색한 스터디그룹을 출력
		for (StudyGroup group : findGroups) {
			System.out.println(">>스터디그룹 조회(전체): " + group.toString());
		}
	}
	
	//검색(id)
	public void findById() {
		System.out.println("검색(Id) 작업");
		//검색한 스터디그룹을 저장할 findGroup 변수 선언
		StudyGroup findGroup = null;
		
		//id로 스터디그룹을 검색할 반복문
		while (true) {
			//InputUtil.getValue() 메소드를 이용하여 사용자로부터 검색할 id를 받음
			String studyId = inputUtil.getValue(">스터디 Id (0.홈으로)");
			if (studyId.equals("0")) {
				break;
			}
			
			/* studyId으로 스터디그룹 검색을 ManagementService 인터페이스에 
			 * 요청하여 반환값을 findGroup에 저장 
			*/
			findGroup = managementService.findById(studyId);
			
			if(findGroup != null ) {//스타디그룹을 찾았으면
				System.out.println(">>스터디그룹 조회(Id): " + findGroup.toString());
			} else {
				System.out.println("해당 Id의 스터디그룹이 없습니다. : " + studyId);
			}
		}
	}
	
	//검색(Name)
	public void findByName() {
		System.out.println("검색(Name) 작업");
		
		/* 검색한 스터디그룹을 저장할 StudyGroup[] 타입의 배열 findGroups 선언
		 * - 스터디그룹명은 동일한 것이 있을 수 있기 때문에 배열로 선언
		 */
		StudyGroup[] findGroups = null;

		//name으로 스터디그룹을 검색할 반복문
		while (true) {
			//InputUtil.getValue() 메소드를 이용하여 사용자로부터 검색할 name를 받음
			String studyName = inputUtil.getValue(">스터디 Name (0.홈으로)");
			if (studyName.equals("0")) {
				break;
			}

			/* studyName으로 스터디그룹 검색을 ManagementService 인터페이스에 
			 * 요청하여 반환값을 findGroup 배열에 저장 
			*/
			findGroups = managementService.findByName(studyName);

			//스타디그룹을 찾았으면
			if(findGroups != null && findGroups.length != 0 ) {
				for (StudyGroup group : findGroups) {
					System.out.println(">>스터디그룹 조회(name) : " + group.toString());
				}
			} else {
				System.out.println("해당 name의 스터디그룹이 없습니다. : " + studyName);
			}
		}
	}
	
	//수정(등록된 스터디그룹 name, topic, period, room 수정) - id
	public void modify() {
		System.out.println("수정 작업");
		
		StudyGroup targetGroup = findByOne();
		
		String name = inputUtil.getValue(">스터디 Name(0.홈, Enter: 수정안함");
		if(name.equals("0")) {return;}
		
		if(!name.isEmpty()) {
			targetGroup.setName(name);
		}
		
		String topic = inputUtil.getValue(">스터디 Topic(0.홈, Enter: 수정안함");
		if(topic.equals("0")) {return;}
		
		if(!topic.isEmpty()) {
			targetGroup.setTopic(topic);
		}
		
		String period = inputUtil.getValue(">스터디 Period(0.홈, Enter: 수정안함");
		if(period.equals("0")) {return;}
		
		if(!period.isEmpty()) {
			targetGroup.setPeriod(period);
		}
		
		String room = inputUtil.getValue(">스터디 Room(0.홈, Enter: 수정안함");
		if(room.equals("0")) {return;}
		
		if(!room.isEmpty()) {
			targetGroup.setRoom(room);
		}
		
		managementService.modify(targetGroup);
		
		System.out.println(">>스터디그룹 수정: "+targetGroup.toString());
	}
	//삭제 - id
	public void remove() {
		System.out.println("삭제 작업");
		
		StudyGroup targetGroup = findByOne();
		
		String confirm = inputUtil.getValue(">>스터디그룹을 삭제하시겠습니까?(y/n)");
		if(confirm.toLowerCase().equals("y")) {
			System.out.println("==>["+targetGroup.getName()+"] 스터디그룹이 삭제됩니다. ");
			managementService.remove(targetGroup.getId());
		}
		else {
			System.out.println(">>스터디그룹 삭제 취소: "+ targetGroup.getName());
		}
	}
	
	//수정(modify) 및 삭제(remove)에서 사용할 스터디그룹(findGroup)을 studyId로 찾아주는 메소드
	private StudyGroup findByOne() {
		StudyGroup findGroup =null;
		
		while(true) {
			String studyId = inputUtil.getValue(">>수정 또는 삭제할 스터디 그룹 Id (0.홈으로)");
			if(studyId.equals("0")) {
				break;
			}
			findGroup = managementService.findById(studyId);
			
			if(findGroup !=null) {
				break;
			}else {
				System.out.println("해당 ID의 클럽이 없습니다.: "+studyId);
			}
		}
		return findGroup;
		
	}
}
