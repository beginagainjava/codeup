package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _4691 {
	
	static int Reward(int a[]) {

		int max = 0;
		int loc = 0;
		int reward = 0;
		
		for(int i = 1; i < 7; i++) {
			if(a[i] >= max) {
				max = a[i];
				loc = i;
			}
		}

		switch(max) {
		case 4 : 
			reward = 50000 + loc * 5000;
			break;
		case 3 :
			reward = 10000 + loc * 1000;
			break;
		case 2 :
			reward = 1000 + loc * 100;
			break;
		case 1 :
			reward = loc * 100;
			break;
		}
		return reward;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[7];
		int n = sc.nextInt();
		
		int max = 0;
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			String in_arr[] = sc.nextLine().split(" ");
			for(int j = 0; j < 4; j++) {
				a[Integer.parseInt(in_arr[j])]++;
			}
			result = Reward(a);
			if(result > max) {
				max = result;
			}
			
		}
		
		System.out.print(result);

	}

}
