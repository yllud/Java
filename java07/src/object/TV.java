package object;

public class TV {
	
	//전역변수(global)
	//멤버변수, 전역변수는 자동 초기화
	public int ch;	//0
	public int vol;
	public boolean onOff;	//false
	
	
	public void turnOn(){
		System.out.println("Turn on the TV");
	}
	
	public void turnOff(){
		System.out.println("Turn off the TV");
	}
	
	public void changeChannel(){
		int change=1;	//지역변수(local)은 자동초기화 x, 초기화 해줘야함
		System.out.println("Change the channel "+ch+" to "+change);
	}
	
}
