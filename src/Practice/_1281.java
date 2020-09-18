package Practice;

import java.util.Scanner;

public class _1281 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int result = 0;
		
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				result -= i;
				System.out.print("-" + i);
			}
			else {
				if(i == a) {
					System.out.print(i);
					result = i;
				} else {
					result += i;
					System.out.print("+" + i);
				}
			}
		}
		if (result < 0) 
			System.out.print("=" + result);
		else
			System.out.print("=+" + result);

	}

}
