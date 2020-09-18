package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _1451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[n+1];
		
		for(int i = 0; i < n; i++)
			a[i] = stdIn.nextInt();
		
		Arrays.sort(a);
		
		for(int i = 0; i < n; i++)
			System.out.println(a[i]);

	}

}
