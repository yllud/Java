package array;

import java.util.Random;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random(42);
		int[] points=new int[10000];
		
		for(int i=0;i<points.length;i++) {
			points[i]=r.nextInt(451);
		}
		
		//1,2,3
		int cnt=0;
		int cnt_2=0;
		int sum=0;
		for(int i=0;i<points.length;i++) {
			sum+=points[i];
			if(points[i]==450) {
				System.out.print(i+" ");
				cnt+=1;
			}
			else if(points[i]==0) {
				cnt_2+=1;
			}
		}
		System.out.println("");
		System.out.println("Number of 450: "+cnt);
		System.out.println("Number of 0: "+cnt_2);
		double avg=(double)sum/points.length;
		System.out.println("Average: "+avg);
		
		// 4
		int cnt_3=0;
		for(int x:points) {
			if((x>=avg-50)&&(x<=avg+50)) {
				cnt_3+=1;
			}
		}
		System.out.println("Count avg-50~avg+50: "+cnt_3);
		
		
		
		
		
	}

}
