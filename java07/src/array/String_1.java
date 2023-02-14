package array;

public class String_1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s="I'm programmer";
		String s2=" really!!";
		System.out.println(s+s2);
		System.out.println(s.concat(s2));	//String
		System.out.println(s.charAt(0));
		char c=s.charAt(1);		//첫번째
		System.out.println(c);
		System.out.println(s.endsWith("r"));	//r로 끝나니?
		boolean result=s.endsWith("r");
		System.out.println(s.substring(3));		//index 3부터 끝까지
		System.out.println(s.substring(3,8));	//index 3~7
		System.out.println(s.contains(s2)); 	//s에 s2 포함?
		System.out.println(s.toUpperCase());	//대문자로
		System.out.println(s.toLowerCase());	//소문자로
		System.out.println(s.length()); 		//글자수
		System.out.println(s.replace("p", "c"));
		
	
	}

}
