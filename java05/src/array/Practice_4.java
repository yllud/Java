package array;

import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] trip_1 = new String[3];
		String[] trip_2 = new String[3];
		int cnt = 0;

		for (int i = 0; i < trip_1.length; i++) {
			System.out.print("Prioriy " + (i+1) + "th in last year: ");
			trip_1[i] = sc.nextLine();
		}
		System.out.println("");
		for (int i = 0; i < trip_2.length; i++) {
			System.out.print("Prioriy " + (i+1) + "th in this year: ");
			trip_2[i] = sc.nextLine();
		}

		for (int i = 0; i < trip_1.length; i++) {
			if (trip_1[i].equals(trip_2[i])) {
				cnt += 1;
			}
		}
		
		System.out.println("\nNumber of same priority: " + cnt);

	}

}
