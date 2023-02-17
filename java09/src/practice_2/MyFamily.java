package practice_2;

public class MyFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=Daughter.wallet;
		Daughter d1=new Daughter("Hong-gilsoon", 'w');
		Daughter d2=new Daughter("Hong-giljin", 'w');
		
		System.out.println("a\n"+d1);
		System.out.println(d2+"\n");
		
		System.out.println("b\n"+"Number of Daugther: "+Daughter.cnt);
		System.out.println("\nc\n"+"Change of wallet: "+first+"=>"+Daughter.wallet);
		
		
	
	}
	
	

}
