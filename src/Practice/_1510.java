package Practice;

import java.util.Scanner;

public class _1510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[][] = new int[n][n];
		int count = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = 0;
			}
		}
		
		int x = 0;
		int y = n/2;
		
		while(a[x][y] == 0) {
			a[x][y] = count;
			if(count % n == 0) {
				x++;
				if(x > n-1)
					x = 0;
			}
			else {
				x--;
				y++;
				if(x < 0)
					x = n-1;
				if(y > n-1)
					y = 0;
				
			}count++;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			} System.out.println();
		}

	}

}
