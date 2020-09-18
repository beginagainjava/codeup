package Practice;

import java.util.Scanner;

public class _1274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		if(n == 2 || n == 3) {
			System.out.print("prime");
			return;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.print("not prime");
				return;
			}
		}
		System.out.print("prime");

	}

}
