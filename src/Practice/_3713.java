package Practice;

import java.util.Scanner;

public class _3713 {
	
	static int a[] = new int[10001];
	
	static int f(int n) {
		
		if(n == 1) return a[n] = 1;
		if(n == 2) return a[n] = 3;
		if(n == 3) return a[n] = 5;
		if(a[n] != 0) return a[n];
		else {
			return a[n] = (f(n-1) + 2 * f(n-2)) % 100007;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(f(n));

	}

}
