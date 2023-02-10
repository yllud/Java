package practice;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("number of apples");
		int num_app=sc.nextInt();
		System.out.println("price of a apple");
		int price_app=sc.nextInt();
		
		System.out.println("number of strawberries");
		int num_str=sc.nextInt();
		System.out.println("price of a strawberry");
		int price_str=sc.nextInt();
		
	
		
		System.out.println("cost of apples: "+num_app*price_app);
		System.out.println("cost of apples: "+num_str*price_str);
		System.out.println("total cost: "+(num_app*price_app+num_str*price_str));
		
		

	}

}
