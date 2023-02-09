package practice;

import java.util.Random;
import java.util.Scanner;

public class Number_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int target = 77;
		Random r = new Random();
		int target = r.nextInt(100); // 0~99
		Scanner sc = new Scanner(System.in);

		int data = 0;
		int count = 0;
		while (true) {
			System.out.print("Your answer?? ");
			data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("Correct");
				System.out.println("attempt count :" + count);
				System.out.println("finish");
				break;
			} else {
				System.out.println("It's wrong");
				System.out.println("Try again");
				if (data > target) {
					System.out.println(">>>>>too large");
				} else {
					System.out.println("<<<<<too small");
				}

			}
		}

		// 1. 오답인 경우 힌트주세요.
		// data가 target보다 크면 "너무 커요"
		// data가 target보다 작으면 "너무 작아요"
		// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꾸세요.
		// 3. 전체 시도 횟수 카운트
		sc.close();
	}

}
