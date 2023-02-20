package collection;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("hong");
		list.add(100);
		list.add(true);

		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		list.add(0, "Kim");
		System.out.println(list);

		// 제거
		list.remove(0); // 파괴함수(o), 비파괴함수???
		// 파괴함수 : 원본을 파괴시버리는 함수(원본이 변형, ram에 있는 데이터 변경)
		// 비파괴함수 : 원본은 파괴되지않는 함수(ram에 있는 데이터 불변)
		System.out.println(list);
		// 변경
		list.set(0, "Jeong"); // 파괴함수(o)
		System.out.println(list);
		
		//index 위치
		int index=list.indexOf(true);
		System.out.println(index);
		
		

	}

}
