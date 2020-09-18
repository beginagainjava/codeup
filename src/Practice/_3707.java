package Practice;

import java.util.Scanner;

public class _3707 {
	
	static long a[] = new long[61];
	
	static long Sum(int n) {
		if(n == 1) return a[n] = 0;
		if(n == 2) return a[n] = 1;
		if(n == 3) return a[n] = 3;
		if(a[n] != 0) return a[n];
		else {
			return a[n] = (long) (Sum(n-1) + Math.pow(2, n-2));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(Sum(n));
		
		

	}

}
