package array;

import javax.swing.JOptionPane;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] point = new int[5];

		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용해야함.
		for (int i = 0; i < point.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			point[i] = Integer.parseInt(data);
		}
		for (int x : point) {
			System.out.print(x + " ");
		}
		System.out.println();

		// 1. 전체 합계구해서, 평균구해보세요.
		int sum=0;
		for(int x:point) {
			sum+=x;
		}
		double avg=(double)sum/point.length;
		System.out.println("avg: "+avg);
		
		// 2. 300이상되는 숫자만 찾아서, 합계를 구해보세요.
		int sum_2=0;
		for(int x:point) {
			if(x>=300) {
				sum_2+=x;
			}
		}
		System.out.println("sum (more than 300): "+sum_2);
		
		
		// 3. 심화문제, 300이상 되는 index를 프린트
		for(int i=0;i<point.length;i++) {
			if(point[i]>=300) {
				System.out.print(i+" ");
			}
		}
		
	}

}
