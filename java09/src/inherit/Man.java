package inherit;

public class Man extends Person {

	//Object의 것들도 있음
	//name, age
	//eat(), sleep()
	
	int power;

	
	@Override
	public String toString() {
		return "Man [power=" + power + ", name=" + name + ", age=" + age + "]";
	}


	public void run() {
		System.out.println("speed up!!");
	}

}
