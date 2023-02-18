package thread;

public class Thread_1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			System.out.println("$");
		}
	}
}
