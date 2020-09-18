package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _3129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in_arr[] = sc.nextLine().split("");
		
		Stack<String> stack = new Stack<>();
		
		stack.push("1");
		
		for(int i = 0; i < in_arr.length; i++) {
			if(stack.peek().equals("(") && in_arr[i].equals(")")) {
				stack.pop();
			} else {
				stack.push(in_arr[i]);
			}
		}
		
		if(stack.pop() == "1")
			System.out.print("good");
		else {
			System.out.print("bad");
		}
		
		

	}

}
