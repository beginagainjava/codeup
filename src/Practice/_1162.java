package Practice;

import java.util.Scanner;

public class _1162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int year = stdIn.nextInt();
		int month = stdIn.nextInt();
		int day = stdIn.nextInt();
		
		int result = year - month + day;
		
		if(result % 10 == 0)
			System.out.print("대박");
		else
			System.out.print("그럭저럭");

	}

}
