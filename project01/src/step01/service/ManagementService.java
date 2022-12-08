package step01.service;

import step01.entity.StudyGroup;

/* 스터디그룹을 관리(등록, 조회, 수정, 삭제)하는 
 * ManagementServiceLogic의 기능을 정의하는 인터페이스 선언 
 */
public interface ManagementService {

	//스터디그룹 등록 메소드
	void register(StudyGroup studyGroup);

	//전체 스터디그룹을 배열로 반환하는 메소드
	StudyGroup[] findAll();

	//id로 스터티그룹을 찾아 배열로 반환하는 메소드
	StudyGroup findById(String studyId);

	//name으로 스터디그룹을 찾아 배열로 반환하는 메소드
	StudyGroup[] findByName(String studyName);

	//스터디그룹 수정 메소드
	void modify(StudyGroup modifyGroup);

	//스터디그룹 삭제 메소드
	void remove(String studyId);
}
