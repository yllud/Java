package Exception;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. print");
		
		try {
			System.out.println("2. error code"+10/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
			System.out.println(e.getMessage());
			
		}
		
		//위에 예외처리해주면 밑에 코드가 작동됌!!
		System.out.println("3. print?");
	}

}
