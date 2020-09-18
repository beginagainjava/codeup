package Practice;

import java.util.Scanner;

public class _1578 {
	
	static int max(int a, int b) {
		int max = 0;
		max = (a > b) ? a : b;
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		System.out.print(max(a,b));

	}

}
