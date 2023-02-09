package array;

public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		int[] arr=new int[5];
		
		// 2
		System.out.println("arr length: "+arr.length);
		
		// 3
		arr[0]=100;
		System.out.println("First arr: "+arr[0]);
		
		// 4
		arr[4]=500;
		System.out.println("Last arr: "+arr[4]);
		
		// 5
		arr[2]=200;
		System.out.println("Third arr: "+arr[2]);
		
		// 6
		System.out.print("total arr: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		// 7
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"th arr:"+arr[i]+" ");
		}
		
	}

}
