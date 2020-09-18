package Practice;

import java.util.Scanner;

public class _4051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float sum = 0;
		
		for(int i = 0; i < 5; i++) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			
			if(b - a <= 1)
				continue;
			else if(b - a > 1 && b - a <= 5) {
				sum += b - a - 1;
			} else {
				sum += 4;
			}
			
		}
		
		float money = 10000 * sum;
		
		if(sum >= 15) {
			money = (float) (money * 0.95);
		}
		else if(sum <= 5) {
			money = (float) (money * 1.05);
		}
		
		System.out.print((int)money);

	}

}
