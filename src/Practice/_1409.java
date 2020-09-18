package Practice;

import java.util.Scanner;

public class _1409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int k = stdIn.nextInt();
		
		System.out.print(a[k-1]);

	}

}
