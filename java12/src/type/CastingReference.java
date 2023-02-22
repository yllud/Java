package type;

import java.util.ArrayList;

import javax.swing.JButton;

public class CastingReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스형변환==참조형형변호나
		//상속!!관계일때만 형변호나 가능
		
		ArrayList list = new ArrayList();
		//자동형변환(업캐스팅)
		list.add("Hong");	//Object(큰) <-String(작)
		list.add(100);	//Object(큰) <-Integer(작)
		list.add(11.1);	//Object(큰) <-Double(작)
		list.add(new JButton("Button"));	//Object(큰) <-JButton(작)
	
		
		//강제 형변환(다운캐스팅)
		String name=(String)list.get(0);
		//String 기능 쓰려면	object->String으로 강제형변환 해야함(다운캐스팅)
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age=(Integer)list.get(1);
		System.out.println(age+1);
		
		double point=(Double)list.get(2);
		System.out.println(point+2);
		
		JButton b=(JButton)list.get(3);
		b.setText("Button2");
		
		
		
	}

}
