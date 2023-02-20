package Exception;

public class Exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num=new int[2];
		try {
			num[3]=2;	//문제 생김
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("Error code: ");
			System.out.println(e.getMessage());
		}
		System.out.println(num.length);
		
	}

}
