package Practice;

import java.util.Scanner;

public class _3704 {
	
	static int a[] = new int[100001];
	
	static int Stair(int n) {
		
		if(n == 1) return a[n] = 1;
		if(n == 2) return a[n] = 2;
		if(n == 3) return a[n] = 4;
		
		if(a[n] != 0) return a[n];
		else {
			return a[n] = (Stair(n-1) + Stair(n-2) + Stair(n-3)) % 1000;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(Stair(n));

	}

}
