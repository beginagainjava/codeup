package Practice;

import java.util.Scanner;

public class _1361 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		for(int i = 0; i <n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			} System.out.print("**"); 
			System.out.println();
		}

	}

}
