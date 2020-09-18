package Practice;

import java.util.Scanner;

public class _1253 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
			System.out.print(i + " ");
		}

	}

}
