package method;

public class Calculator_3 {
	public String add(int x, int y) {
		return "Today customer: " + (x + y);
	}

	public String minus(int x, int y) {
		if (x >= y) {
			return "difference customer: " + (x - y);
		}
		else {
			return "difference customer: " + (y-x);
		}
	}
	
	public int multi(int x, int y) {
		return (x * y);
	}
	
	public double div(double x, int y) {
		return (x / y);
	}

}
