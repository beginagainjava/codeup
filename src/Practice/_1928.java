package Practice;

import java.util.Scanner;

public class _1928 {
	
	static int Code(int n) {
		System.out.println(n);
		if(n == 1) {
			return 1;
		} else {
			if(n % 2 == 0) {
				n = n / 2;
				return Code(n);
			} else {
				n = 3 * n + 1;
				return Code(n);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Code(n);

	}

}
