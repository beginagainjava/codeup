package Practice;

import java.util.Scanner;

public class _1620 {
	
	static int sum(int a) {
		
		int temp = 0;
		
		while(a != 0) {
			temp += (a % 10);
			a = a / 10;
		}
			
		if(temp / 10 == 0)
			return temp;
		else
			return sum(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		System.out.print(sum(a));

	}

}
