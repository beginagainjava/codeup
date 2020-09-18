package Practice;

import java.util.Scanner;

public class _1509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a[][] = new int[11][11];
		
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				a[i][j] = stdIn.nextInt();
			}
		}
		
		int b[] = new int[11];
		for(int i = 1; i < 11; i++) {
			b[i] = stdIn.nextInt();
		}
		
		String str[] = new String[11];
		
		for(int i = 1; i < 11; i++) {
			for(int j = 10; j > 0; j--) {
				if(b[i] == 0) {
					continue;
				}
				else {
					if(a[j][i] > 0) {
						str[i] = "crash";
						break;
					}
					else if(a[j][i] < 0) {
						str[i] = "fall";
						break;
					}
					else
						str[i] = "safe";
				}
			}
		}
		
		for(int i = 1; i <11; i++) {
			if(str[i] == null)
				continue;
			System.out.println(i + " " + str[i]);
		}

	}

}
