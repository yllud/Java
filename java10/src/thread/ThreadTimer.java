package thread;

import java.util.Date;

public class ThreadTimer extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=500;i>0;i--) {
			Date date=new Date();
			System.out.println("timer: "+date);

			try {
				Thread.sleep(1000);	//1초 재워라!==>1초에 한번씩 타이머가 돌아감
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("cpu connection error");
			}
		}
	}
}

