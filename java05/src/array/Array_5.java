package array;

import java.util.Random;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(42);

		int[] n1 = new int[10000];
		int[] n2 = new int[10000];

		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0; // 동일한 갯수 누적
		int count2 = 0; // 동일하지 않은 갯수 누적

		for (int i = 0; i < n2.length; i++) {
			//System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
			}
		} // for
		System.out.println("same grade>> " + count);
		System.out.println("defferent grade>> " + count2);
		
		int cnt_1=0;
		int cnt_2=0;
		
		for(int i=0;i<n2.length;i++) {
			if(n1[i]<n2[i]) {
				cnt_1+=1;
			}
			else if(n1[i]>n2[i]){
				cnt_2+=1;
			}
		}
		System.out.println("raise grade>> " + cnt_1);
		System.out.println("down grade>> " + cnt_2);
	}

}
