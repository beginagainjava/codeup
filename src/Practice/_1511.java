package Practice;

import java.util.Scanner;

public class _1511 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[][] = new int[n][n];
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = count;
				if(j == 0 || j == n-1 || i == 0|| i == n-1)
					sum += count;
				count++;
			}
		}
		
		/*
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}System.out.println();
		}
		*/
		System.out.print(sum);;

	}

}
