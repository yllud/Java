package practice_3;

public class Truck extends Car{
	
	int luggage;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Truck runs~~!!");
	}
	
	public void carry() {
		System.out.println("carry "+luggage+" luggage(s)");
	}

	@Override
	public String toString() {
		return "Truck [luggage=" + luggage + ", number=" + number + ", speed=" + speed + "]";
	}

}
