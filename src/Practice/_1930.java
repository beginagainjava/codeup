package Practice;

import java.util.Scanner;

public class _1930 {
	
	static int temp[][] = new int[15][15];
	
	static int SuperSum(int k, int n) {
		
		if(k == 0) {
			return temp[0][n] = n;
		} else if(n == 1) {
			return temp[k][1] = 1;
		}
		
		if(temp[k][n] != 0) {
			return temp[k][n];
		} else {
			return temp[k][n] = SuperSum(k,n-1) + SuperSum(k-1,n);
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int k;
		int n;
		
		int count = 0;
		

		while(sc.hasNextInt()) {
			k = sc.nextInt();
			n = sc.nextInt();
			System.out.println(SuperSum(k,n));
		}

	}

}
