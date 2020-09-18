package Practice;

import java.util.Scanner;

public class _1901 {
	
	static int temp = 1;
	
	static void print(int n) {
		if(temp == n)
			System.out.println(n);
		else {
			System.out.println(temp);
			temp++;
			print(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print(n);
		

	}

}
