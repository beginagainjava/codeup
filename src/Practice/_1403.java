package Practice;

import java.util.Scanner;

public class _1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int k = stdIn.nextInt();
		int a[] = new int[k+1];
		
		for(int i = 0; i < k; i++) {
			a[i] = stdIn.nextInt();
		}
		
		int j = 0;
		while(j != 2) {
			for(int i = 0; i < k; i++) {
				System.out.println(a[i]);
			}
			j++;
		}

	}
	

}
