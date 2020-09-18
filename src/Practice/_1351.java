package Practice;

import java.util.Scanner;

public class _1351 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		for(int i = a; i <= b; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}

	}

}
