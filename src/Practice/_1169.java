package Practice;

import java.util.Scanner;

public class _1169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int old = stdIn.nextInt();
		int result = (2013 - old) % 100;
		int sex;
		
		if(old > 13) 
			sex = 1;
		else
			sex = 3;
		
		System.out.print(result + " " + sex);
	}

}
