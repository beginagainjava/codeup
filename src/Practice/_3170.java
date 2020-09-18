package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _3170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> card = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String[] in_arr = sc.nextLine().split(" ");
			int number = Integer.parseInt(in_arr[1]);
			if(card.containsKey(in_arr[0])) {
				int value = card.get(in_arr[0]);
				card.put(in_arr[0], value +  number);
			} else {
				card.put(in_arr[0], number);
			}
			
		}
		
		for(int i = 0; i < m; i++) {
			String question = sc.nextLine();
			list.add(question);
		}
		/*
		System.out.println(card.toString());
		
		for(String x : list)
			System.out.println(x.toString());
		*/
		
		for(int i = 0; i < m; i++) {
			if(card.containsKey(list.get(i))) {
				System.out.println(card.get(list.get(i)));
			} else {
				System.out.println("0");
			}
		}

	}

}
