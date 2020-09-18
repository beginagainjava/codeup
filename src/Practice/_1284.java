package Practice;

import java.util.Scanner;

public class _1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int n = 0;
		int i;
		
		if (a == 1 || a == 2) {
			System.out.print("wrong number");
			return;
		}
		
		for(i = 2; i < 10; i++) {
			if (a % i == 0) {
				n = a / i;
				break;
			}
		}
		
		System.out.print(Math.min(n, i) + " " + Math.max(n, i));

	}

}
