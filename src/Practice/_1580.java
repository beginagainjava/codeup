package Practice;

import java.util.Scanner;

public class _1580 {
	
	static double circle(int r) {
		return 3.14 * r * r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int r = stdIn.nextInt();
		
		System.out.printf("%.2f",circle(r));

	}

}
