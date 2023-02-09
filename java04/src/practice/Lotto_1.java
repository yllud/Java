package practice;

import java.util.Random;

public class Lotto_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("lotto number: " + r.nextInt(10)); //0~9 중에 랜덤값
		}
		
		
	}

}
