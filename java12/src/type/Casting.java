package type;

import java.util.ArrayList;

import javax.swing.JButton;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("hong");	//Object <- String (자동형변환)
		list.add(100);		//Object <- Integer(랩퍼클래스,포장)
		list.add(11.22);	//object <- Double(랩퍼클래스) <-오토박싱 -double(기본형)
		list.add(new JButton()); //object <- JButton
		
		String a=(String)list.get(0);	//직접접근! 랜덤액세스 가능! 강제형변환
		//String <- Object, 강제형변환
		System.out.println(a);
		
		int age=(Integer)list.get(1);
		
		
		
	}

}
