package constructor;

public class Computer {
	
	int price;
	String company;
	int size;
	
	
	public Computer(int price, String company, int size) {
		//super();
		this.price = price;
		this.company = company;
		this.size = size;
	}


	@Override
	public String toString() {
		return "Computer [price=" + price + ", company=" + company + ", size=" + size + "]";
	}
	
	

}
