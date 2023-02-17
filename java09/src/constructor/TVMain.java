package constructor;


public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1=new TV(10,5,true);
		t1.ch=10;
		t1.vol=20;
		t1.onOff=true;

		t1.turnOn();
		t1.turnOff();
		t1.changeChannel();
		
	}

}
