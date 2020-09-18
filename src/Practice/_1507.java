package Practice;

import java.util.Scanner;

public class _1507 {
	
	static void check(int x1, int y1, int x2, int y2, int result[][]) {
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j < y2; j++) {
				if(result[i][j] == 0)
					result[i][j] = 1;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int xy[][] = new int[4][4];
		int square[][] = new int[100][100];
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				xy[i][j] = stdIn.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
				check(xy[i][0], xy[i][1], xy[i][2], xy[i][3], square);
			}
		
		int max = 0;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(xy[i][j] > max)
					max = xy[i][j];
			}
		}
		
		int result = 0;
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < max; j++) {
				if(square[i][j] == 1)
					result++;
			}
		}
		
		System.out.print(result);

	}

}
