package Practice;

import java.util.Scanner;

public class _1168 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int year = stdIn.nextInt();
		int sex = stdIn.nextInt();
		int old = 0;
		
		year = year / 10000;
		
		if(sex == 1  || sex == 2) {
			year += 1900;
			old = 2013 - year;
		} else {
			year += 2000;
			old = 2013 - year;
		}
		
		System.out.print(old);

	}

}
