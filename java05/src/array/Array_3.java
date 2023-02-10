package array;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("name\tage\theight");
		
		String[] family= {"dad","mom","me"};
		int[] age= {50,50,25};
		double[] height= {175.0,160.0,174.0};
		
		for(int i=0;i<family.length;i++) {
			System.out.println(family[i]+"\t"+age[i]+"\t"+height[i]);
		}
		System.out.println("name\tage\theight");

	}

}
