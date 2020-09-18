package Practice;

import java.util.Scanner;

public class _3702 {
	
	static int a[][] = new int[51][51];
	
	static int Pascal(int r, int c) {

		if(r == 1 || c == 1) {
			return a[r][c] = a[c][r] = 1;
		} 
		if(a[r][c] != 0) {
			return a[r][c];
		} else {
			return a[r][c] = a[c][r] = (Pascal(r-1,c) + Pascal(r,c-1)) % 100000000;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt(); 
		
		System.out.println(Pascal(r,c));
		
	}

}
