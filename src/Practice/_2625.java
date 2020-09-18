package Practice;

import java.util.Scanner;

public class _2625 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = 0;
		
		int temp = (n % 3 != 0) ? 1 : 0;
		
		for(int i = (n / 3) + temp; i < (n / 2) + (n % 2); i++)
			t += i - ((n - i) / 2 + (n - 1) % 2) + 1;
		
		System.out.print(t);

	}

}
