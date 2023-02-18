package thread;

import java.util.Date;

public class ThreadCount extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=500;i>0;i--) {
			System.out.println("count: "+i);

			try {
				Thread.sleep(2000);	//2초 재워라!==>2초에 한번씩 카운트가 돌아감
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("cpu connection error");
			}
		}
	}
}
