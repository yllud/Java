package practice;

public class ThreadA extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int start=1;
		for(int i=1;i<101;i++) {
			System.out.println("Lets count "+start+"~"+(start+9));
			start+=10;
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("connction error");
			}
		}
	}
}
