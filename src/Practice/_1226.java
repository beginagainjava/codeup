package Practice;

import java.util.Scanner;

public class _1226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[] = new int[6];
		int bonus;
		int b[] = new int[6];
		int count = 0, bonuscount = 0;
		
		for(int i = 0; i < 6; i++)
			a[i] = stdIn.nextInt();
		
		bonus = stdIn.nextInt();
		
		for(int i = 0; i < 6; i++)
			b[i] = stdIn.nextInt();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++)
				if(a[i] == b[j])
					count++;
		}
		
		for(int i = 0; i < 6; i++) {
			if(b[i] == bonus) {
				bonuscount++;
				break;
			}
		}
		
		if(count == 6)
			System.out.print("1");
		else if (count == 5 && bonuscount == 1)
			System.out.print("2");
		else if (count == 5)
			System.out.print("3");
		else if (count == 4)
			System.out.print("4");
		else if (count == 3)
			System.out.print("5");
		else
			System.out.print("0");
	
		

	}

}
