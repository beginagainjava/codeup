package Practice;

import java.util.Scanner;

public class _4592 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int paper[][] = new int[111][111];
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j = x; j < x+10; j++) {
				for(int k = y; k < y+10; k++) {
					paper[j][k]++;
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(paper[i][j] != 0) {
					result++;
				}
			}
		}
		
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				System.out.print(paper[i][j]);
				} System.out.println();
			}
		
		System.out.print(result);

	}

}
