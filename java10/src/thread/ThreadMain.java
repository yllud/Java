package thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//thread 부품 2개 사용
		ThreadAdd add=new ThreadAdd();
		ThreadMinus minus=new ThreadMinus();
		
		
		//thread 프로그램 2개 시작
		add.start();
		minus.start();

	}

}
