package Practice;

import java.util.Scanner;

public class _1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(c >= a + b) {
			System.out.print("»ï°¢Çü¾Æ´Ô");
			return;
		}
		
		if (a == b && b == c)
			System.out.print("Á¤»ï°¢Çü");
		else if (a == b || b == c || c == a)
			System.out.print("ÀÌµîº¯»ï°¢Çü");
		else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
			System.out.print("Á÷°¢»ï°¢Çü");
		else
			System.out.print("»ï°¢Çü");
		

	}

}
