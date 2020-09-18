package Practice;

import java.util.Scanner;

public class _1754 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.nextLine();
		String b[] = a.split(" ");
		
		if(b[0].compareTo(b[1]) == -1)
			System.out.print(b[0] + " " + b[1]);
		else if(b[0].compareTo(b[1]) == 1 || b[0].compareTo(b[1]) == 0)
			System.out.print(b[1] + " " + b[0]);

	}

}
