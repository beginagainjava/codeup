package Practice;

import java.util.Scanner;

public class _4726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			a[i] = temp;
		}
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i < n-k+1; i++) {
			for(int j = 0; j < k; j++) {
				sum += a[i+j];
			}
			if(sum > max) {
				max = sum;
			} sum = 0;
		}
		
		System.out.print(max);
		

	}

}
