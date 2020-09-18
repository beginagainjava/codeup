package Practice;

import java.util.Scanner;

public class _1295 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);

		String a = stdIn.nextLine();
		char b[] = a.toCharArray();

		//a = 97, A = 65, z =122, Z = 90
		for(int i = 0; i < b.length; i++) {
			if('a' <= b[i] || b[i] <= 'z') {
				System.out.printf("%c",b[i] - 32);
			}
			else if ('A' <= b[i] || b[i] <= 'Z')
				System.out.printf("%c",b[i] + 32);
			else
				System.out.printf("%c",b[i]);
		}

	}

}
