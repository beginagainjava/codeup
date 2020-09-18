package Practice;

import java.util.Scanner;

public class _1615 {
	
	static int check (int a) {
		int temp = 0;
		
		if(a >= 1000) temp = a + a%10000 + a%1000 + a%100 + a%10;
		else if(a >= 100) temp = a + a%1000 + a%100 + a%10;
		else if(a >= 10) temp = a + a%100 + a%10;
		else if(a >= 1) temp = a + a%10;
		
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int result = 0;
		
		for(int i = a; i <= b; i++)
			result += i;
		
		for(int i = a; i <= b; i++) {
			if(a <= check(i) || check(i) <= b)
				result -= i;
			else
				continue;
		}
		
		System.out.print(result);

	}

}
