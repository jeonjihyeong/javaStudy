package sec03.exam01.polymorphism.step01;

public class Main {
	public static void main(String[] args) {
		Human[] humans =  new Human[3];
		Tiger[] tigers = new Tiger[3];
		Eagle[] eagles = new Eagle[3];
		
		for (int i = 0; i<humans.length;i++) {
			int num =(int) (Math.random()*3);
			System.out.println(num);
			
			if(num == 0) {
				humans[i]= new Human();
			} else if (num ==1) {
				tigers[i]=new Tiger();
			}else {
				eagles[i] = new Eagle();
			}
		}
		for (int i = 0;i<humans.length;i++) {
			if(humans[i] !=null) {
				humans[i].humanMove();
			}else if (tigers[i]!=null) {
				tigers[i].tigerMove();
			}else {
				eagles[i].eagleMove();
			}
		}
	}
}
