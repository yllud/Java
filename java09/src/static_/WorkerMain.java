package static_;

public class WorkerMain {
	
	
	
	public static void main(String[] args) {
		
		Worker work1=new Worker("Hong", 25, "w");
		Worker work2=new Worker("Hong", 24, "w");
		Worker work3=new Worker("Hong", 27, "w");
		
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		
		System.out.println(Worker.sum/Worker.cnt);
		
		System.out.println(Worker.getAvg());
		
	}

}
