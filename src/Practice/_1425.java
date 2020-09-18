package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _1425 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < n; i++) {
			if(i % c == 0 && i != 0) {
				System.out.println();
				System.out.print(a[i] + " ");
			}
			else
				System.out.print(a[i] + " ");
		}

	}

}
