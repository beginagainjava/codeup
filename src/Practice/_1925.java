package Practice;

import java.util.Scanner;

public class _1925 {
	
	static int a[] = new int[31];
	
	static int f(int n) {
		
		if(n == 1) return a[n] = 1;
		if(n == 2) return a[n] = 2;
		if(n == 3) return a[n] = 6;
		if(a[n] != 0) return a[n];
		else return a[n] = n * f(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int result = f(n) / (f(n-r) * f(r));
		System.out.print(result);

	}

}
