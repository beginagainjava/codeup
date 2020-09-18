package Practice;

import java.util.Scanner;

public class _1508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[][] = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			a[i][0] = stdIn.nextInt();
		}
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j <= i; j++) {
				a[i+1][j+1] = a[i+1][j] - a[i][j]; 
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			} System.out.println();
		}
		

	}

}
