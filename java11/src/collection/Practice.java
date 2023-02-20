package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		HashSet trip=new HashSet();
		trip.add("Jeju");
		trip.add("Seoul");
		trip.add("Europe");
		trip.add("Africa");
		trip.add("America");
		System.out.println(trip+"\n\n");
		
		// 2
		HashMap home=new HashMap();
		home.put("Main","TV");
		home.put("Living","sofa");
		home.put("Kitchen","Refrigerator");
		home.put("Entrance","shoes");
		
		System.out.println(home);
		System.out.println(home.get("Entrance"));
		home.replace("Living", "table");
		System.out.println(home+"\n\n");
		
		// 3
		ArrayList list=new ArrayList();
		list.add("Breakfast");
		list.add("study");
		list.add("Lunch");
		list.add("Game");
		list.add("Sleep");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		list.set(1, "clean");
		System.out.println(list);
		
		
	}

}
