package Practice;

import java.util.Scanner;

public class _1405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[n+1];
		int temp;
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(a[j] + " ");
			} System.out.println();
			
			temp = a[0];
			
			for(int k = 0; k < n; k++) {
				a[k] = a[k+1];
			}
			
			a[n-1] = temp;
		}

	}

}
