package Practice;

import java.util.Scanner;

public class Valentain_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		String c[][] = new String[8][8];
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if((i+j) % 2 == 0) {
					c[i][j] = "00";
				}
				else {
					c[i][j] = "**";
				}
			}
		}
		
		String p = "";
		int a, b;
		
		while(p != "14") {
			p = stdIn.next();
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			
			if(p.length() == 1) {
				c[a-1][b-1] = "0" + p ;
			}
			else {
				c[a-1][b-1] += p;
			}
		}
		
		for(int i = 0; i <8; i++) {
			for(int j = 0; j <8; j++) {
				System.out.print(c[i][j]);
			} System.out.println();
		}
		
		

	}

}
