package 조건문;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나의 대한 정보");
		System.out.println("----------");
		System.out.print("이름 입력 >> ");
		String data = sc.nextLine();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("취미 입력 >> ");
		String hobby = sc.nextLine();
		System.out.println();
		System.out.println("---------");
		System.out.println("나의 이름은 " + data + "입니다.");
		System.out.println("나의 나이은 " + age + "세 입니다.");
		System.out.println("나의 취미은 " + hobby + "입니다.");
		sc.close();
	}

}
