package step01.service.logic;

import java.util.Arrays;
import step01.entity.StudyGroup;
import step01.service.ManagementService;

public class ManagementServiceLogic implements ManagementService {
	//StudyGroup을 저장할 배열 선언
	private StudyGroup[] groups;
	//배열 인덱스 선언
	private int index;
	
	//생성자
	public ManagementServiceLogic() {
		//StudyGroup을 저장할 배열 생성
		this.groups = new StudyGroup[6];
		this.index = 0;
	}
		
	//StudyGroup 등록
	@Override
	public void register(StudyGroup studyGroup) {
		//매개변수로 받은 생성된 스터디그룹을 groups 배열에 저장 
		groups[index] = studyGroup;
		index++;//스터디그룹이 생성될 때마다 index 증가		
	}

	//등록된 StudyGroup 검색(전체)
	@Override
	public StudyGroup[] findAll() {
		/* groups 배열에 등록된 스터디그룹의 요소만큼 복사하여 반환
		 * 배열 복사: Arrays.copyOfRange(원본배열, from(인덱스), to(인덱스);
		 */
		return Arrays.copyOfRange(groups, 0, index);
	}

	//등록된 StudyGroup 검색(id)
	@Override
	public StudyGroup findById(String studyId) {
		//등록된 스터디그룹들만 뽑아내어 registeredGroups 배열에 할당(배열에서 0부터 index까지 복사)
		StudyGroup[] registeredGroups = Arrays.copyOfRange(groups, 0, index);
		
		//Id로 찾은 스터디그룹을 저장할 참조 변수
		StudyGroup findGroup = null;
		
		for (StudyGroup group : registeredGroups) {
			if (group.getId().equals(studyId)) {//id가 같은 스터디그룹을 찾았으면
				findGroup = group;
				break;
			}
		}
		return findGroup;
	}

	//등록된 StudyGroup 검색(name)
	@Override
	public StudyGroup[] findByName(String studyName) {
		//등록된 스터디그룹들만 뽑아내어 registeredGroups 배열에 할당
		StudyGroup[] registeredGroups = Arrays.copyOfRange(groups, 0, index);
		
		//Name으로 찾은 스터디그룹을 저장할 배열 생성
		StudyGroup[] findGroups = new StudyGroup[registeredGroups.length];

		//findGroups 배열의 index
		int subIndex = 0;
		
		//studyName과 같은 스터디그룹을 모두 찾아 findGroups 배열에 저장
		for (StudyGroup group : registeredGroups) {
			if (group.getName().equals(studyName)) {
				findGroups[subIndex] = group;
				subIndex++;
			}
		}		

		/* studyName으로 검색한 스터디그룹들이 저장된 findGroups 배열에서 
		   스터디그룹 Name이 저장된 요소만 복사하여 반환(null 요소 제외) */
		return Arrays.copyOfRange(findGroups, 0, subIndex);
	}

	//등록된 StudyGroup 수정(modifyGroup(StudyGroupManagemt에서 수정된 스터디그룹))
	@Override
	public void modify(StudyGroup modifyGroup) {
		int modifyIndex = 0;
		for (int i = 0;i<groups.length;i++) {
			if(groups[i].getId().equals(modifyGroup.getId())) {
				modifyIndex =i;
				break;
			}
		}
		
		this.groups[modifyIndex]= modifyGroup;
	}

	//등록된 StudyGroup 삭제(id)
	@Override
	public void remove(String studyId) {
		int removeIndex = 0;
		
		for (int i =0;i<groups.length;i++) {
			if(groups[i].getId().equals(studyId)) {
				removeIndex = i;
				break;
			}
		}
		for (int i = removeIndex; i<this.index+1;i++) {
			groups[i]=groups[i+1];
		}
		this.index--;
	}
}
