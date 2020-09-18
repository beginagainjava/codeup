package Practice;

import java.util.Scanner;

public class _1915 {
	
	static int Fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(Fibonacci(n));

	}

}
