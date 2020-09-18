package Practice;

import java.util.Scanner;

public class _1953 {
	
	static int count = 0;
	
	static void Star(int n) {
		if(n <= 0) return;
		Star(n-1);
		g(n);
		System.out.println();
	}
	
	static void g(int k) {
		if( k <= 0 ) return;
		g(k-1);
		System.out.print("*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Star(n);

	}

}
