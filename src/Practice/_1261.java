package Practice;

import java.util.Scanner;

public class _1261 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[] = new int[10];
		
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			a[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(a[i] % 5 == 0) {
				result = a[i];
				System.out.print(result);
				break;
			}
		}
		if(result == 0)
			System.out.print("0");

	}

}
