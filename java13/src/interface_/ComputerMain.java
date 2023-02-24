package interface_;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppleComputer app=new AppleComputer();
		BananaComputer ban=new BananaComputer();
		
		app.format();
		app.turnOff();
		app.turnOn();
		
		ban.format();
		ban.turnOff();
		ban.turnOn();
	}

}
