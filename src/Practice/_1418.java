package Practice;

import java.util.Scanner;

public class _1418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		char a[] = str.toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 't')
				System.out.print((i+1) + " ");
		}
		

	}

}
