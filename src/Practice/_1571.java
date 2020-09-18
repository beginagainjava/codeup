package Practice;

import java.util.Scanner;

public class _1571 {
	
	static int n, k;
	
	static int f(int s, int a[]) {
		
		int result = 0;
		
		for(int i = 1; i <=n; i++) {
			result = i;
			if(a[i] > s) {
				return result;
			}
		}
		return  result + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		n = stdIn.nextInt();
		
		int a[] = new int[n+1];
		
		for(int i = 1; i <= n; i++)
			a[i] = stdIn.nextInt();

		k = stdIn.nextInt();
		
		System.out.print(f(k,a));
		
		

	}

}
