package Practice;

import java.util.Scanner;

public class _2650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min;
		
		min = Math.min(a, b);
		min = Math.min(min, c);
		
		System.out.print(min);

	}

}
