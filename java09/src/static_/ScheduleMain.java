package static_;

public class ScheduleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Schedule day1 = new Schedule("sutdy java", 8, "samsung station"); // 4개
		System.out.println(Schedule.count);
		Schedule day2 = new Schedule("walking", 1, "Coex");
		System.out.println(Schedule.count);
		Schedule day3 = new Schedule("studying", 2, "Room5");
		System.out.println(Schedule.count);

		// 총12개 다이나믹 생성, 멤버변수 ==> 객체생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		// 인스턴스 변수라고 부른다.

		System.out.println(day1);
		System.out.println(Schedule.count);
		System.out.println(day2);
		System.out.println(day3);
	}

}
