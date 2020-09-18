package Practice;

import java.util.Scanner;

public class _1512 {
	
	static int x;
	static int y;

	static int d(int a, int b) {
		return Math.abs(a-x) + Math.abs(b-y) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		x = stdIn.nextInt();
		y = stdIn.nextInt();

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(d(i,j) + " ");
			} System.out.println();
		}
		
		
	}

}
