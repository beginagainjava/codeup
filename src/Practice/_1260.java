package Practice;

import java.util.Scanner;

public class _1260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int result = 0;
		
		for(int i = a; i <= b; i++) {
			if(i % 3 == 0)
				result += i;
		}
		
		System.out.print(result);

	}

}
