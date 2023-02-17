package practice_3;

public class CoffeeTruck extends Truck {
	
	int order;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("CoffeeTruck runs~~!!");
	}
	
	public void ordering() {
		System.out.println("Number of coffee orders: "+order);
	}

	@Override
	public String toString() {
		return "CoffeeTruck [order=" + order + ", luggage=" + luggage + ", number=" + number + ", speed=" + speed + "]";
	}

}
