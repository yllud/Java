package inherit;

public class Superman extends Man{
	
	boolean fly;
	
	public void space() {
		sleep();
		System.out.println("name: " + name);
		System.out.println("fly in the space");
	}
	
	@Override
	public String toString() {
		return "Superman [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		//super.eat();
		System.out.println("Super eat~~~");
	}
	
	
}
