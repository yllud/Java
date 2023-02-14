package array;

public class Array_2d_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//값이 있는 배열
		int[][] arr1= {
				{1,2,3},
				{4,5,6},	
		};
		System.out.println(arr1.length);
		System.out.println(arr1[0][0]);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println("");
		}
		
		//값이 업는 배열, 공간만 생성
		int[][] arr2=new int[2][];
	
	
	
	}

}
