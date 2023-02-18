package inherit;

public class Ballpoint extends Tool {
	
	int thick;
	
	@Override
	public String toString() {
		return "Ballpoint [thick=" + thick + ", price=" + price + ", company=" + company + "]";
	}
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		//super.buy();
		System.out.println("buy the ballpoint: "+price+"won");
	}
	public void write() {
		System.out.println("write with "+thick+"mm ballpoint");
	}
		
	
}
