package Practice;

import java.util.Scanner;

public class _4711 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum += -a + b;
			
			if(sum > max)
				max = sum;
		}
		System.out.print(max);

	}

}
