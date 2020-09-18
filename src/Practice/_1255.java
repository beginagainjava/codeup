package Practice;

import java.util.Scanner;

public class _1255 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		double a = stdIn.nextDouble();
		double b = stdIn.nextDouble();
		
		for(double i = a; i <= b; i += 0.01) {
			System.out.printf("%.2f", i);
			System.out.print(" ");
		}

	}

}
