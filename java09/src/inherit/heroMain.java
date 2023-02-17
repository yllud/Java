package inherit;

public class heroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.name="hong";
		p.age=100;
		System.out.println(p);
		p.eat();
		System.out.println("");
		
		
		Man m=new Man();
		p.eat();
		m.run();
		System.out.println("");
		
		Superman s=new Superman();
		s.name="superman";
		s.eat();
		s.run();
		s.space();
		System.out.println("");
		
		Wonderwoman wonder=new Wonderwoman();
		wonder.name="wonder";
		wonder.eat();
		wonder.run();
		wonder.information();
		
	}

}
