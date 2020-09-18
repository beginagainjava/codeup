package Practice;

import java.util.Scanner;

public class _1902 {
	
	static void print(int n) {
		if(n == 1)
			System.out.println(n);
		else {
			System.out.println(n);
			print(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(n);
		
	}

}
