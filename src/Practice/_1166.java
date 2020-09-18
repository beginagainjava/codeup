package Practice;

import java.util.Scanner;

public class _1166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int year = stdIn.nextInt();
		
		if((year % 4) == 0 && (year % 100) != 0 || (year % 400 == 0))
			System.out.print("yes");
		else
			System.out.print("no");

	}

}
