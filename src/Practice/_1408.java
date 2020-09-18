package Practice;

import java.util.Scanner;

public class _1408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.nextLine();
		char b[] = a.toCharArray();
		
		for(int i = 0; i < b.length; i++) {
			System.out.printf("%c", b[i]+2);
		}
		System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			System.out.printf("%c", (b[i] * 7) % 80 + 48);
		}


	}

}
