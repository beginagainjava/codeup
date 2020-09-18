package Practice;

import java.util.Scanner;

public class _1414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		char a[] = str.toCharArray();
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 'c' || a[i] == 'C') {
				count++;
			}
		} System.out.println(count);
		count = 0;
		
		for(int i = 0; i < a.length -1; i++) {
			String compare = "" + a[i] + "" + a[i+1];
			if(compare.equals("cc") || compare.equals("cC") || compare.equals("CC") || compare.equals("Cc"))
				count++;
		} System.out.print(count);

	}

}
