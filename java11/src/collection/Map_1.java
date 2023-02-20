package collection;

import java.util.HashMap;

public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		//map.put(key,value)
		map.put("Apple", 1);
		map.put("Melon", 1);
		map.put("Water", 1);
		
		System.out.println(map);
		System.out.println(map.get("Apple"));
		
		map.remove("Water");
		System.out.println(map);
		map.replace("Melon",5);
		System.out.println(map);
		
	}

}
