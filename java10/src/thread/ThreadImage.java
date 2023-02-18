package thread;

public class ThreadImage extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] images= {"1.png","2.png","3.png","4.png","5.png"};
		for(int i=0;i<5;i++) {
			System.out.println("timer: "+images[i]);

			try {
				Thread.sleep(5000);	//5초 재워라!==>5초에 한번씩 타이머가 돌아감
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("cpu connection error");
			}
		}
	}
}

