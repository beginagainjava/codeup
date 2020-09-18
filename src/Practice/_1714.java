package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _1714 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in_arr[] = sc.nextLine().split("");

		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < in_arr.length; i++) {
			stack.push(in_arr[i]);
		}
		
		for(int i = 0; i < in_arr.length; i++) {
			System.out.print(stack.pop());
		}

	}

}
