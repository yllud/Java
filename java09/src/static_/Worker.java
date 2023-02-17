package static_;

public class Worker {
	
	
	static int cnt;
	static double sum;
	String name;
	int age;
	String gender;
	
	
	public Worker(String name, int age, String gender) {
		//super();
		cnt++;
		sum+=age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	//객체 생성하지 않고 클래스 이름으로 불러서 쓰고싶음
	//->
	public static double getAvg() {
		
		//static method에서 전역변수 접근할 떄는
		//같은 static 변수만 가능!
		//System.out.println(name);
		//->에러
		
		return (double)sum/cnt;
	}

	

}
