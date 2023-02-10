package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력>> ");
		String name = sc.next(); //한단어 홍길동
		System.out.print("나이 입력>> ");
		int age = sc.nextInt();
		System.out.print("키 입력>> ");
		double height = sc.nextDouble(); //"88.8" --> 88.8
		System.out.print("저녁을 먹었나요(true/false)>> ");
		boolean food = sc.nextBoolean(); //"true" --> true
		System.out.print("올해의 목표는 ");
		sc.nextLine();
		String life = sc.nextLine();
		
		System.out.println("=======================");
		System.out.println("내 이름은 " + name);
		System.out.println("내년 나이는 " + (age + 1));
		System.out.println("내년 키는 " + (height + 10));
		if (food) {
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배가 고프시겠군요");
		}
		System.out.println("올해의 목표는 " + life);
		sc.close();
	}

}
