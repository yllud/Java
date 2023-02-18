package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_1 t1=new Thread_1();
		Thread_2 t2=new Thread_2();
		Thread_3 t3=new Thread_3();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
