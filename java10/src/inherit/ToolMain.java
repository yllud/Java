package inherit;

public class ToolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tool t=new Tool();
		t.price=7000;
		t.company="Ain";
		System.out.println(t);
		t.buy();
		
		
		Ballpoint pen=new Ballpoint();
		pen.price=5000;
		pen.company="zebra";
		pen.thick=5;
		
		System.out.println("\n"+pen);
		pen.buy();
		pen.write();
		
	}

}
