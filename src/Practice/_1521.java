package Practice;

import java.util.Scanner;

public class _1521 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		
		int a[][] = new int[k][k];
		
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < k; j++) {
				a[i][j] = sc.nextInt();
				
				if(a[i][j] != -1) {
					a[i][j] += n;
				}
				
				if(a[i][j] >= 0 && a[i][j] <= 5) {
					count++;
				}
			}
		}
		/*
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < k; j++) {
				System.out.print(a[i][j] + " ");
			} System.out.println();
		}
		*/
		
		System.out.print(count);

	}

}
