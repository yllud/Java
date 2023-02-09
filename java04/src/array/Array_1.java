package array;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 여러개의 데이터를 램에 저장해두고 cpu가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		//1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20, 30, 40}; //length만들어서 몇개인지 세서 값을 넣어줌.
		System.out.println(jumsu);
		System.out.println(jumsu[0]); //첫번째값.
		System.out.println(jumsu[1]); //두번째값.
		System.out.println(jumsu[2]); //세번째값.
		System.out.println(jumsu[3]); //네번째값.
		System.out.println("count: " + jumsu.length); //이 주소가 가르키는 length변수
		
		jumsu[0] = 100; //첫번째값으로 100을 넣으세요. 10<--100
		System.out.println(jumsu[0]);
		
		//2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어두고
		//   나중에 값을 넣는 경우
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);
		
		// 1. 배열에 일주일간 공부한 시간을 저장해보세요
				int[] week = {8, 8, 8, 9, 8, 10, 10};
				
				// 2. 첫번째 위치와 두번째 위치값을 프린트
				System.out.println(week[0]);
				System.out.println(week[1]);
				//3. week배열에 들어있는 데이터 수를 프린트
				System.out.println(week.length);
				//4. 세번째 위치값을 10으로, 다섯번째 위치값을 12로 넣기
				week[2] = 10;
				week[4] = 12;
				
				//5. 세번째, 다섯번째 위치값을 프린트
				System.out.println(week[2]);
				System.out.println(week[4]);
				
				//6. 배열을 처음에 만들 때 값을 모름, 크기는 4개
				int[] tour = new int[4];
						
			    //7. 첫번째 인덱스에 20, 세번째 위치에 30>프린트
				tour[0] = 20;
				tour[2] = 30;
				System.out.println(tour[0]);
				System.out.println(tour[2]);
				
				//8. tour변수의 개수를 프린트
				System.out.println(tour.length);
	

	}

}
