package Practice;

import java.util.Scanner;

public class _1538 {
	
	static void f(int n) {
		if(n % 2 == 0) System.out.print("even");
		else System.out.print("odd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		f(n);

	}

}
