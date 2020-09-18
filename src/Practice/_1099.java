package Practice;

import java.util.Scanner;

public class _1099 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int a[][] = new int[12][12];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				a[i][j] = stdIn.nextInt();
			}
		}
		
		int x = 1;
		int y = 1;
		while(a[x][y] != 2) {
			if(a[x][y] == 0)
				a[x][y] = 9;
			if(a[x][y+1] == 0)
				++y;
			else
				++x;
		} a[x][y] = 9;

		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(a[i][j] + " ");
			}System.out.println();
		}
		
		

	}

}
