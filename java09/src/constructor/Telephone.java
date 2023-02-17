package constructor;

public class Telephone {
	//성질 : 멤버변수(가격, 종류, 모양)
	public int price;		//멤버변수는 자동초기화!(0)	/ int price=0;
	public String shape;	//기본형이 아닌경우(참조형) null로 초기화
	
	
	
	
	//동작 : 멤버메서드(=함수), 동적인 기능
	public void surfing() {
		System.out.println("connect wifi");
		System.out.println("connect data");
	}
	public void message() {
		System.out.println("talk talk");
		System.out.println("upload file");
	}
	

}
