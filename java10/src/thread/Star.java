package thread;

public class Star extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5000;i++) {
			System.out.println(i+": *");
		}
	}
}
