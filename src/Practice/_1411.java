package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _1411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n-1; i++) {
			a[i] = stdIn.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		} System.out.println();
		
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != i) {
				break;
			} else {
				result++;
			}
		}
		
		System.out.print(result);
		

	}

}
