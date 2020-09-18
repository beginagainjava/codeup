package Practice;

import java.util.Scanner;

public class _1283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		double a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		double c[] = new double[b];
		
		double result = a;
		
		for(int i = 0; i < b; i++) {
			c[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < b; i++) {
			result = result * (1 + c[i]/100);
		}
		
		result -= a;
		
		System.out.printf("%.0f", result);
		System.out.println();
		
		if(result > 0)
			System.out.print("good");
		else if(result == 0)
			System.out.print("same");
		else
			System.out.print("bad");
		
	}

}
