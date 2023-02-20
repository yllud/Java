package collection;

import java.util.ArrayList;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		
		list.add("Park");
		list.add("Song");
		list.add("Kim");
		list.add("Jeong");
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		ArrayList list2 = new ArrayList();
		list2.add("lee");
		list2.add("park"); 
		list2.add("yang");
		list2.addAll(list2); //파괴형함수
		System.out.println(list2);
		
		System.out.println(list2.isEmpty());	//비어있니?
		System.out.println(list2);
	
	
	}

}
