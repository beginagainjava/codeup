package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _4624 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in_arr[] = sc.nextLine().split("");
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < in_arr.length; i++) {
			if(stack.isEmpty()) {
				stack.push(in_arr[i]);
			} else {
				if(stack.peek().equals("(") && in_arr.equals(")")) {
					stack.pop();
					stack.push("2");
				} else if(stack.peek().equals("[") && in_arr.equals("]")) {
					stack.pop();
					stack.push("3");
				}
			}
			
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}

		
		
		
	}

}
