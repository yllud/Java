package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCount count=new ThreadCount();
		ThreadTimer timer=new ThreadTimer();
		ThreadImage image=new ThreadImage();
		
		count.start();
		timer.start();
		image.start();
	}

}
