package inherit;

public class Person extends Object {
	
	String name;
	int age;
	
	
	//사람 동작 ===> 메소드
	public void eat() {
		System.out.println("eat");
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void sleep() {
		System.out.println("zzzz....");
	}
	
	
	
}
