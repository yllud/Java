package practice;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value");
		int start=sc.nextInt();
		System.out.println("Enter the last value");
		int last=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=last;i++) {
			sum+=i;
		}
		
		System.out.println("sum from start to last: "+sum);

	}

}
