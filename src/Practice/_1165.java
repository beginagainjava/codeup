package Practice;

import java.util.Scanner;

public class _1165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int time = stdIn.nextInt();
		int score = stdIn.nextInt();
		
		for(int i = time; i < 90; i+=5) {
			score++;
		}
		
		System.out.print(score);

	}

}
