package practice_3;

public class Car extends Object{
	int number;
	int speed;
	
	public void run() {
		System.out.println("Car runs~~!!");
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
}
