package thread;

public class Name extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<4700;i++) {
			System.out.println(i+": ahn");
		}
	}
}
