package Practice;

import java.util.Scanner;

public class _4056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		if(n <= 500) {
			result = n * 7 / 10;
		} 
		else if(500 < n && n <= 1500) {
			result = 350 + (n-500) * 4 / 10;
		} 
		else if(1500 < n && n <= 4500) {
			result = 750 + (n-1500) * 15 / 100;
		}
		else if(4500 < n && n <= 10000) {
			result = 1200 + (n-4500) * 5 / 100;
		} 
		else {
			result = 1475 + (n-10000) * 2 / 100;
		}
		
		System.out.print(result);

	}

}
