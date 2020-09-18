package Practice;

import java.util.Scanner;

public class _2632 {
	
	static int temp[] = new int[22];
	
	static int Stair(int n) {
		if(n == 1 || n == 2) {
			return temp[n] = 1;
		}
		if(temp[n] != 0) {
			return temp[n];
		} else {
			return temp[n] = Stair(n-1) + Stair(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(Stair(n+1));

	}

}
