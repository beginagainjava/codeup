package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _1430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int m = stdIn.nextInt();
		int b[] = new int[m];
		for(int i = 0; i < b.length; i++) {
			b[i] = stdIn.nextInt();
		}

		
		int c[] = new int[m];
		
		/*
		for(int i = 0; i < c.length; i++)
			c[i] = 0;
			*/
		
		int check = 0;
		int k = 0;
		
		while(check != m) {
			if(b[check] == a[k]) {
				b[check] = 1;
				k = 0;
				check++;
			}
			else if(k == n-1) {
				b[check] = 0;
				k = 0;
				check++;
			}
			else
				k++;
		}
		/*
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(b[i] == a[j]) {
					c[i] = 1;
					break;
				}
			}
		}
		*/
		
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		

	}

}
