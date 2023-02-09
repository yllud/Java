package practice;

import java.util.Random;

public class Lotto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		
		//0~44
		for (int i = 0; i < 6; i++) {
			System.out.println("lotto number: " + r.nextInt(45)); //0~9 중에 랜덤값
		}
		
		System.out.println("");
		
		//3~30
		for (int i = 0; i < 6; i++) {
			System.out.println("lotto number: " + (r.nextInt(28)+3)); //0~9 중에 랜덤값
		}
		
		
	}

}
