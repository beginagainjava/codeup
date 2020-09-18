package Practice;

import java.util.Scanner;

public class _1440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[n];
		int temp;
		
		for(int i = 0; i < a.length; i++)
			a[i] = stdIn.nextInt();
		
		//String b[] = new String[n-1];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print((i+1) + ": ");
			for(int j = 0; j < a.length; j++) {
				if(i == j) {
				}
				else {
					if(a[i] > a[j])
						System.out.print("> ");
					else if(a[i] == a[j])
						System.out.print("= ");
					else
						System.out.print("< ");
				}
			}
			System.out.println();
		}

	}

}
