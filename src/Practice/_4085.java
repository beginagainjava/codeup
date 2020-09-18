package Practice;

import java.util.Scanner;

public class _4085 {
	
	static int m,n,x,y;
	
	public static int f(int a, int b, int array[][]) {
		int temp = 0;
		for(int i = a; i < y+a; i++) {
			for(int j = b; j < x+b; j++) {
				temp += array[i][j];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		m = stdIn.nextInt();
		n = stdIn.nextInt();
		x = stdIn.nextInt();
		y = stdIn.nextInt();
		
		int array[][] = new int[n * 2][m * 2];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				array[i][j] = stdIn.nextInt();
			}
		}
		
		int max = 0;
		
		int check = 0; 
		int check2 = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int temp = f(i,j,array);
				if(temp > max) {
					max = temp;
					
					check = i;
					check2 = j;
					System.out.println("checking " + check + " " + check2 + " " + max);
				}
			}
		}
		
		System.out.print(max);
		System.out.println();
		System.out.println(check + " " + check2);

	}

}
