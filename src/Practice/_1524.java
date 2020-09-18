package Practice;

import java.util.Scanner;

public class _1524 {
	
	static int count = 0;
	
	static int find(int a, int b, int array[][]) {
		count = 0;
		for(int i = a-1; i < 2 + a; i++) {
			for(int j = b-1; j < 2 + b; j++) {
				if(array[i][j] == 1)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[][] = new int[11][11];

		
	//	int count = 0;
		
		for(int i = 1; i < 10; i ++) {
			for(int j = 1; j < 10; j++) {
				a[i][j] = stdIn.nextInt();
			}
		}
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(a[x][y] == 1) {
			System.out.print("-1");
			return;
		}
		
		int result = find(x,y,a);

		System.out.print(result);
		
		

	}

}
