package Practice;

import java.util.Scanner;

public class _3714 {
	
	static int a[] = new int[10001];
	
	static int f(int n) {
		if(n == 1) return 1;
		if(n == 2) return 5;
		if(n == 3) return 11;
		if(a[n] != 0) return a[n];
		else {
			return a[n] = (f(n-1) + 4 * f(n-2) + 2 * f(n-3)) % 100007;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(f(n));

	}

}
