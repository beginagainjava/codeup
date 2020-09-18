package Practice;

import java.util.Scanner;

public class _1407 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		String a[] = str.toString().split(" ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}

	}

}
