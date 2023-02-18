package thread;

public class ThreadAdd extends Thread {
	// run() : 동시에 실행될 내용을 run에 넣는다..원래는 비어있음

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println("add>> " + i);
		}
	}
	
	
	
	

}
