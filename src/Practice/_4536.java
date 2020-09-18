package Practice;

import java.util.Scanner;

public class _4536 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int in_arr[] = new int[10];
		int count_arr[] = new int[101];
		int ave = 0;
		
		for(int i = 0; i < 10; i++) {
			in_arr[i] = sc.nextInt() / 10;
			ave += in_arr[i];
		}
		
		for(int i = 0; i < 10; i++) {
			count_arr[in_arr[i]]++;
		}
		
		int max = 0;
		int max_numeber = 0;
		
		for(int i = 0; i < 101; i++) {
			if(max < count_arr[i]) {
				max = count_arr[i];
				max_numeber = i;
			}
		}
		
		System.out.println(ave);
		System.out.println(max_numeber*10);

	}

}
