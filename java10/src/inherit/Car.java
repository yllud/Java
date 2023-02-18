package inherit;

public class Car {
	
	String color;
	
	public void run() {
		System.out.println(color+" car runs~~");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
	

}
