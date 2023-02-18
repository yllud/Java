package practice;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		
		a.start();
		b.start();

	}

}
