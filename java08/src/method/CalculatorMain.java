package method;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator_1 cal=new Calculator_1();
//		cal.plus(10, 5);
//		cal.multi(30,20,15);
//		int a=cal.minus(30, 20);
//		//System.out.println(a);
//		
//		Calculator_2 cal2=new Calculator_2();
//		//System.out.println(cal2.add(15.5,60));
		
		
		
		Calculator_3 cal3=new Calculator_3();
		int price=7000;
		int cnt1=5;
		int cnt2=4;
		
		//1
		String result1=cal3.add(cnt1, cnt2);
		System.out.println(result1);
		
		//2
		String result2=cal3.minus(cnt1, cnt2);
		System.out.println(result2);
		
		//3,4,5
		int result3=cal3.multi(price,cnt1);
		int result4=cal3.multi(price,cnt2);
		System.out.println("A.M payment: "+result3);
		System.out.println("P.M payment: "+result4);
		System.out.println("Today total payment: "+(result3+result4));
		
		//6
		double result6=cal3.div(result3+result4,cnt1+cnt2);
		System.out.println("payment per person: "+result6);
		
		
		
		
		
				
	}

}
