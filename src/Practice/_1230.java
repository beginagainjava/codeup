package Practice;

import java.util.Scanner;

public class _1230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if(a[i] <= 170) {
				System.out.print("CRASH " + a[i]);
				return;
			}
			
		}
		
		System.out.print("PASS");

	}

}
