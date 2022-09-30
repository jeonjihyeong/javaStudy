package chap06.sec01.exam01;

public class TelevisionExam {
	public static void main(String[] args) {
//		객체 생성
		Television tv;
		tv = new Television();
		
		tv.setModel("SAMSUNG Neo OLED");
		tv.setSize("100인치");
		System.out.println(tv.infoTv());
		tv.setPower();
		if(tv.isPower()) {
			System.out.println("TV: power: ON");
		}else {
			System.out.println("TV: power: OFF");
		}
		
		Television tv2 = new Television();
		
		tv2.setModel("LG Evo OLED");
		tv2.setSize("100인치");
		System.out.println(tv2.infoTv());
		
		tv2.setPower();
		if(tv2.getPower()) {
			System.out.println("TV power: ON");
		}else {
			System.out.println("TV power: OFF");
		}
		
		tv2.setChannel(3);
		System.out.println("채널은 "+ tv2.getChannel()+"입니다.");
		
		tv2.setPower();
		if(tv2.getPower()) {
			System.out.println("TV power: ON");
		}else {
			System.out.println("TV power: OFF");
		}
		
		
		tv.setChannel(24);
		System.out.println("채널은 "+tv.getChannel()+"입니다.");
		
		tv.channelDown();
		System.out.println("채널은 "+tv.getChannel()+"입니다.");
	}
	

}
