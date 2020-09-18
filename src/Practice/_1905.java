package Practice;

import java.util.Scanner;

public class _1905 {
	
	static int sum(int n) {
		if(n == 1)
			return n;
		else {
			return n * sum(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(sum(n));
		

	}

}
