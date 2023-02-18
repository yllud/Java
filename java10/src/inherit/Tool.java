package inherit;

public class Tool {
	int price;
	String company;
	
	public void buy() {
		System.out.println("Buy the tool: "+price+"won");
	}

	@Override
	public String toString() {
		return "Tool [price=" + price + ", company=" + company + "]";
	}
	
	

}
