package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _4531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ave = 0;
		int in_arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			in_arr[i] = sc.nextInt();
			ave += in_arr[i];
		}
		
		Arrays.sort(in_arr);
		
		System.out.println(ave/5);
		System.out.println(in_arr[2]);
	

	}

}
