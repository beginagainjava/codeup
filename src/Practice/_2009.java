package Practice;

import java.util.Scanner;

public class _2009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int count = 0;
		
		while(k >= n) {
			k = k - n + 1;
			count++;
		}
		
		System.out.print(count);

	}

}
