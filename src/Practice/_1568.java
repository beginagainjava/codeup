package Practice;

import java.util.Scanner;

public class _1568 {
	
	static int n,a,b;
	
	static int maxi(int a, int b, int c[]) {
		int temp = -2147483648;
		int result = 0;
		
		for(int i = a; i <= b; i++) {
			if(c[i] > temp) {
				temp = c[i];
				result = i;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		n = stdIn.nextInt();
		int c[] = new int[n+1];
		for(int i = 1; i <=n; i++)
			c[i] = stdIn.nextInt();
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		System.out.print(maxi(a,b,c));

	}

}
