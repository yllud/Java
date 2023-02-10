package practice;

import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting value");
		int start=sc.nextInt();
		System.out.println("Enter the last value");
		int last=sc.nextInt();
		System.out.println("Enter the jump value");
		int jump=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=last;i=i+jump) {
			
			sum+=i;
			
			if(sum>100){
				System.exit(0);
				//break;
			}
		}
		
		System.out.println("sum from start to last: "+sum);
		sc.close();
	}

}
