package Practice;

import java.util.Scanner;

public class _1904 {
	
	static void print(int a, int b) {
		int temp = a;
		if(temp <= b ) {
			if(temp % 2 == 1) {
				System.out.print(temp + " ");
			}
			temp++;
			print(temp, b);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		print(a,b);

	}

}
