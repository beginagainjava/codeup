package Practice;

import java.util.Scanner;

public class _3712 {
	
	static int a[] = new int[10001];
	
	static int f(int n) {
		
		if(n <= 2) return a[n] = 0;
		if(n == 3) return a[n] = 2;
		if(a[n] != 0) {
			return a[n];
		} else {
			return a[n] = (2 * f(n-3)) % 100000007;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(f(n));

	}

}
