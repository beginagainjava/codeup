package Practice;

import java.util.Scanner;

public class _4651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String a[] = {"E","A","B","C","D"};
		for(int i = 0; i < 3; i++) {
			String in_arr[] = sc.nextLine().split(" ");
			int count = 0;
			for(int j = 0; j < 4; j++) {
				if(in_arr[j].equals("0")) {
					count++;
				}
			} System.out.println(a[count]);
		}

	}

}
