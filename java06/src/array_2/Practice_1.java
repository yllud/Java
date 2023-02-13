package array_2;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] subject= {"Korean","English","Math","Computer","Chemistry"};
		int[] grade_1= {44,66,22,99,100};
		int[] grade_2= grade_1.clone();
		System.out.println(grade_1==grade_2);
		grade_2[0]=22;
		grade_2[2]=88;

		int cnt=0,cnt_2=0,cnt_3=0;
		int[] j=new int[5];
		
		for(int i=0;i<grade_1.length;i++) {
			//1
			if(grade_1[i]==grade_2[i]) {
				cnt++;
			}
			//2
			else if(grade_1[i]<grade_2[i]) {
				cnt_2++;
			}
			//3
			else {
				cnt_3++;
				//4
				System.out.println("Advanced subject: "+subject[i]);
			}
		}
		System.out.println("Same grade: "+cnt);
		System.out.println("grade_1 > grade_2: "+cnt_2);
		System.out.println("grade_1 < grade_2: "+cnt_3);		
		
	}

}
