package Practice;

import java.util.Scanner;

public class _2721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		String s1 = stdIn.nextLine();
		String s2 = stdIn.nextLine();
		String s3 = stdIn.nextLine();
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		char c3[] = s3.toCharArray();
		
		if(c1[c1.length-1] == c2[0] && c2[c2.length-1] == c3[0] && c3[c3.length-1] == c1[0]) {
			System.out.print("good");
		}
		else
			System.out.print("bad");

	}

}
