package Practice;

import java.util.Scanner;

public class _3715 {
	
	static int n;
	
	static int f(int o, int c) {
		if(o == n && c == n) return 1;
		int t = 0;
		if(o < n) t += f(o + 1, c);
		if(o > c) t += f(o, c + 1);
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		System.out.print(f(0,0));
		

	}

}
