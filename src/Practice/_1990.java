package Practice;

import java.util.Scanner;

public class _1990 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.next();
		char a[] = str.toCharArray();
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		if(result % 3 == 0)
			System.out.print("1");
		else
			System.out.print("0");

	}

}
