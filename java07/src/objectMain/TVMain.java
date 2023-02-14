package objectMain;

import object.TV;

public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1=new TV();
		t1.ch=10;
		t1.vol=20;
		t1.onOff=true;

		t1.turnOn();
		t1.turnOff();
		t1.changeChannel();
		
	}

}
