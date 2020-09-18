package Practice;

import java.util.Scanner;

public class _4721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
	
		for(int i = 0; i < n; i++) {
			String in_arr[] = sc.nextLine().split(" ");
			
			a += Integer.parseInt(in_arr[0]);
			b += Integer.parseInt(in_arr[1]);
			c += Integer.parseInt(in_arr[2]);
			
		}
		
		int max = Math.max(a, b);
		max = Math.max(max, c);
		
		if(a == b || b == c || c == a) {
			System.out.print("0 " + max);
		} else if(max == a) {
			System.out.print("1 " + max);
		} else if(max == b) {
			System.out.print("2 " + max);
		} else if(max == c) {
			System.out.print("3 " + max);
		}

	}

}
