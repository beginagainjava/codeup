package Practice;

import java.util.Scanner;

public class _1164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[] = new int[3];
		boolean result = true;
		
		for(int i = 0; i <3; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < 3; i++) {
			if(a[i] <= 170) {
				result = false;
				System.out.print("CRASH");
				break;
			}
		}
		
		if(result == true)
			System.out.print("PASS");

	}

}
