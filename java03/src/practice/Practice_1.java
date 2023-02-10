package practice;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ID");
		String id=sc.nextLine();
		
		System.out.println("password");
		String pw=sc.nextLine();
		
		if(id.equals("root")&&pw.equals("1234")) {
			System.out.println("Login success");
		}
	}

}
