package inherit;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyCar c=new FlyCar();
		c.color="Blue";
		c.fly=true;
		
		System.out.println(c);
		c.run();
		c.fly();
		
	}

}
