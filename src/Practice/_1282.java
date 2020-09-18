package Practice;

import java.util.Scanner;

public class _1282 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		double n = stdIn.nextDouble();
		double k = 0;
		double result = 0;

		for(k = 1; k < n; k++) {
			if(k * k > n) {
				break;
			}
		}
		k -= 1;
		
		System.out.print((int)(n-k*k) + " " +(int)k);

	}

}
