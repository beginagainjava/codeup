package Practice;

import java.util.Scanner;

public class _4626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int bonus = 0;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int answer = sc.nextInt();
			if(answer == 1) {
				sum += (1 + bonus);
				bonus++;
			}
			else {
				bonus = 0;
			}
			
		}
		System.out.print(sum);

	}

}
