package step01.entity;

import java.util.UUID;

import step01.util.DateUtil;

public class StudyGroup {
	private static final int MIN_NAME_LENGTH = 2;
	private static final int MIN_TOPIC_LENGTH = 5;
	
	private String id;
	private String name;
	private String topic;
	private String period;
	private String room;
	private String foundationDay;
	private StudyGroup() {
		this.id = UUID.randomUUID().toString();
	}
	public StudyGroup(String name, String topic, String period, String room) {
		this();
		setName(name);
		setTopic(topic);
		this.period = period;
		this.room = room;
		this.foundationDay = DateUtil.toDay();
	}
	
	//	게터/세터
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<MIN_NAME_LENGTH) {
			System.out.println("groupName은 2자리 이상입니다.");
			return;
		}
		this.name = name;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		if(name.length()<MIN_TOPIC_LENGTH) {
			System.out.println("intro는 5자리 이상입니다.");
			return;
		}
		this.period = period;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[스터디그룹 정보]");
		builder.append("\n------------------------------");
		builder.append("\n * 아이디: "+this.id);
		builder.append("\n * 스터디명: "+this.name);
		builder.append("\n * 스터디주제: "+this.topic);
		builder.append("\n * 스터디기간: "+this.period);
		builder.append("\n * 스터디장소: "+this.room);
		builder.append("\n * 등록일: "+this.foundationDay);
		
		return builder.toString();
	}

	
}
