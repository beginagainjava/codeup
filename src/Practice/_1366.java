package Practice;

import java.util.Scanner;

public class _1366 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == n-1 || j == 0 || j == n-1 || i==j || i+j == n-1 || i == (n-1)/2 || j == (n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			} System.out.println();
		}

	}

}
