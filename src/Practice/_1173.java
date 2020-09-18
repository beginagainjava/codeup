package Practice;

import java.util.Scanner;

public class _1173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(b < 30) {
			if(a == 0) {
				a = 23;
				b += 30;
			} else {
				a -= 1;
			 	b += 30;
			}
			
		} else {
			b -= 30;
		}
		
		System.out.print(a + " " + b);

	}

}
