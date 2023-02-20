package thread;

import java.util.Date;

public class ThreadTimer extends Thread {
	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			Date date = new Date();
			System.out.println("Timer>> " + date);
			try {
				ThreadTimer.sleep(2000); // 2초재워라!
			} catch (Exception e) {
				System.out.println("Error cpu");
			}
		}
	}
}
