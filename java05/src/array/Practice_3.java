package array;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Hong","Lee","Newjeans","BTS","BlackPink"};
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		int cnt_1=0,cnt_2=0,cnt_3=0,sum_1=0,sum_2=0,j=0;

		for(int i=0;i<names.length;i++) {
			// 1,2
			if(term1[i]<term2[i]) {
				cnt_1+=1;
			}
			else if(term1[i]==term2[i]) {
				cnt_2+=1;
			}
			//3
			if(term2[i]==100) {
				cnt_3+=1;
			}
			//4
			sum_1+=term1[i];
			sum_2+=term2[i];
			//5
			if(names[i].equals("Newjeans")) {
				j=i;
			}
		}
		// 1,2,3
		System.out.println("raise grade: "+cnt_1);
		System.out.println("same grade: "+cnt_2);
		System.out.println("Perfect grade in term2: "+cnt_3);
		// 4
		double avg_1=(double)sum_1/names.length;
		double avg_2=(double)sum_2/names.length;		
		System.out.println("avg of term1: "+avg_1+"\navg of term2: "+avg_2);
		// 5
		System.out.println("Newjeans grade in term1: "+term1[j]+"\nNewjeans grade in term1: "+term2[j]);
	}

}
