package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _1167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.print(a[1]);

	}

}
