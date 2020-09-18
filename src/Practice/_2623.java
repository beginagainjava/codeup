package Practice;

import java.util.Scanner;

public class _2623 {
	
	static int gcd(int a, int b) {
		int temp = 1;
		while (temp > 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in_arr[] = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(in_arr[0]);
		int b = Integer.parseInt(in_arr[1]);
		
		System.out.print(gcd(a,b));

	}

}
