package Practice;

import java.util.Scanner;

public class _2033 {
	
	static int matrix[][] = new int[100002][102];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 1; i < n+1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			matrix[i][a] = b;
			matrix[i][b] = a;
			
		}
		
		int p = sc.nextInt();
		
		for(int i = 1; i <= n+1; i++) {
			if(i == n + 1) {
				System.out.print(p);
			} else {
				if(matrix[i][p] == 0) {
					continue;
				} else {
					p = matrix[i][p];
				}
			}
		}

	}

}
