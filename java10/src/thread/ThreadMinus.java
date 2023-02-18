package thread;

public class ThreadMinus extends Thread {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 100; i > 0; i--) {
			System.out.println("minus>> " + i);

		}
	}
	
	
	
	
}
