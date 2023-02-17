package constructor;

public class TV {

	// 전역변수(global)
	// 멤버변수, 전역변수는 자동 초기화
	public int ch; // 0
	public int vol;
	public boolean onOff; // false

	public TV() {
		System.out.println("hi");
	}

//	public TV(int ch,int vol,boolean onOff) {
//		//heap 에 저장된 멤버변수를 넣어줌
//		this.ch=ch;
//		this.vol=vol;
//		this.onOff=onOff;
//		
//	}

	public TV(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}

	public void turnOn() {
		System.out.println("Turn on the TV");
	}

	public void turnOff() {
		System.out.println("Turn off the TV");
	}

	public void changeChannel() {
		int change = 1; // 지역변수(local)은 자동초기화 x, 초기화 해줘야함
		System.out.println("Change the channel " + ch + " to " + change);
	}

}
