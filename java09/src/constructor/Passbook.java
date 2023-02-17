package constructor;

public class Passbook {
	String name;
	String ssn; //주민번호
	int money;
	
	
	public Passbook(String name, String ssn, int money) {
		//super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}


	@Override
	public String toString() {
		return "Passbook [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}

	
	
	
	

}
