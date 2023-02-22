package type;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList me=new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('m');
		
		// 1
		System.out.println(me);
		
		// 2
		int money=(int)me.get(0);
		money+=2000;
		me.set(0, money);
		System.out.println(me);
		
		// 3
		double height=(double)me.get(1);
		height+=10;
		me.set(1, height);
		System.out.println(me);
		
		// 4
		boolean eat=(boolean)me.get(2);
		eat=true;
		me.set(2, eat);
		System.out.println(me);
		
		// 5
		if((char)me.get(3)=='m') {
			System.out.println("ssn: 1 or 3");
		}
		else {
			System.out.println("ssn: 2 or 4");
		}
		
		// 6
		
		// 2 int<-object (다운캐스팅, 강제형변환)
		//   object<-int (업캐스팅, 자동형변환)
		
		// 3 double<-object (다운캐스팅, 강제형변환)
		//   double<-object (업캐스팅, 자동형변환)
	}

}
