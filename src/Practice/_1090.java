package Practice;

import java.util.Scanner;

public class _1090 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextInt();
		long r = stdIn.nextInt();
		long n = stdIn.nextInt();
		long result = a;
		
		for(int i = 1; i < n; i++) {
			result *= r;
		}
		
		System.out.print(result);

	}

}
