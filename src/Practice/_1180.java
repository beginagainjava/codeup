package Practice;

import java.util.Scanner;

public class _1180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = a % 10;
		int c = a / 10;
		
		int result = (b*10 + c) * 2;
		
		if(result >= 100) {
			result -= 100;
		}
		
		System.out.println(result);
		
		if(result > 50) {
			System.out.print("OH MY GOD");
		}
		else
			System.out.print("GOOD");

	}

}
