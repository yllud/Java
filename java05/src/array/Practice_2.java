package array;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.print("arr "+i+": ");
			arr[i]=sc.nextInt();
		}
		System.out.println("arr[0]+arr[2]="+(arr[0]+arr[2]));
		
		
		// 2
		String[] str=new String[3];
		sc.nextLine();
		for(int i=0;i<str.length;i++) {
			System.out.print("String "+i+": ");
			str[i]=sc.nextLine();
		}
		System.out.println(str[1]+" rather than "+str[0]);
	}

}
