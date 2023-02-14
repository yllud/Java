package array;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  010-245-1234" ;
		
		//1 공백 제거
		String s0=s.trim();
		System.out.println(s0);
		//2 - split
		String[] s2=s0.split("-");
		System.out.println(s2[0]);
		
		//3
		if(s2[0].equals("011")) {
			System.out.println("SK");
		}
		else if(s2[0].equals("019")) {
			System.out.println("LG");
		}
		else {
			System.out.println("Apple");
		}
		
		//4
		if(s2[1].length()>=4){
			System.out.println("new phone");
		}
		else {
			System.out.println("old phone");
		}
		
		//5
		int len=0;
		for(int i=0;i<s2.length;i++) {
			len+=s2[i].length();
		}
		if(len>=10) {
			System.out.println("Valid number");
		}
		else {
			System.out.println("Invalid number");
		}
		
		//or
		String s3=s0.replace("-", "");
		System.out.println(s3+" length: "+s3.length());
		
		
	}

}
