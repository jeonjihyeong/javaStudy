package chap06.sec01.exam01;

public class Television {
	private String model;
	private String size;
	private boolean power;
	private int channel;
//	생성자
	public Television() {
		System.out.println("Television 생성자 호출");
	}
	
	
public Television(String model) {
	super();
	this.model = model;
}

public Television(String model, String size) {
	super();
	this.model = model;
	this.size = size;
}


//메소드(getter/setter)
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean getPower() {
		return power;
	}

	public void setPower() {
		this.power = !power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
//	channel UP 메소드
	public void channelUp() {
		this.channel++;
		System.out.println("Channel UP!");
	}
//	channelDown 메소드
	public void channelDown() {
		this.channel--;
		System.out.println("Channel DOWN!");
	}
	
	public String infoTv() {
		return "TV info [model:"+model+", size:"+size+"]";
	}
}
