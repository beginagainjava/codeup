package Practice;

import java.util.Scanner;

public class _1370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int h = stdIn.nextInt();
		int r = stdIn.nextInt();
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < 2 * h - 1; j++) {
				for(int k = 0; k < h; k++) {
					if(k == j || (k+j) == 2 * h - 2) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}System.out.println();
			} 
		}

	}

}
