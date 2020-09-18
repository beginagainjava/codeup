package Practice;

import java.util.Scanner;

public class _1410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		String str = stdIn.nextLine();
		String a[] = str.toString().split("");
		int count_front = 0;
		int count_back = 0;
		String f = "(";
		String b = ")";
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i].equals(f))
				count_front++;
			else if(a[i].equals(b))
				count_back++;
		}
		
		System.out.print(count_front + " " + count_back);

	}

}
