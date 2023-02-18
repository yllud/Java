package practice;

public class ThreadB extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<1001;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("connction error");
			}
			
		}
	}
}
