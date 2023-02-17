package practice_2;

public class Daughter {
	
	static int cnt;
	static int wallet=10000;
	String name;
	char gender;
	
	public Daughter(String name, char gender) {
		cnt++;
		wallet-=1000;
		
		this.name=name;
		this.gender=gender;
	}
	
	public void watchTV() {
		System.out.println("watching TV~");
	}

	@Override
	public String toString() {
		return "Daughter [name=" + name + ", gender=" + gender + "]";
	}

}
