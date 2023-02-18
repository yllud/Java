package inherit;

public class Employee {
	
	String name;
	String address;
	int salary;
	String rrn;	//주민번호
	
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
	
}
