package Practice;

import java.util.Scanner;

public class _4741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		int n = sc.nextInt();

		min += n;
		if (min >= 60) {
			hour += min / 60;
			min = min % 60;
		}
		if(hour >= 24) {
			hour -= 24;
		}
		
		System.out.print(hour + " " + min);

	}

}
