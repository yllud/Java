package inherit;

public class FlyCar extends Car{
	
	boolean fly;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println(color+" flyCar runs~~");
	}
	
	public void fly() {
		System.out.println(color+" flyCar flies~~");
	}
}
