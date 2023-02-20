package collection;

import java.util.LinkedList;

public class Queue_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList subject=new LinkedList();
		subject.add("Korean");
		subject.add("Math");
		subject.add("English");
		subject.add("computer");
		System.out.println(subject);
		
		subject.remove();	//먼저 들어간게 먼저나옴
		System.out.println(subject);

		subject.remove();
		System.out.println(subject);
		
		subject.remove();
		System.out.println(subject);
	}

}
