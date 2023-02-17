package static_;

public class Schedule {

	static int count;
	String title;
	int time;
	String location;
	
	public Schedule(String title,int time, String location) {
		//super();
		count++;
		this.title = title;
		this.time=time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Schedule [title=" + title + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
