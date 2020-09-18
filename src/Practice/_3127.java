package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _3127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in_arr[] = sc.nextLine().split(" ");
		
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < in_arr.length; i++) {
			System.out.print(in_arr[i]);
		}System.out.println();
		
		for(int i = 0; i < in_arr.length; i++) {
			if(in_arr[i].equals("*") || in_arr[i].equals("+") || in_arr[i].equals("-")) {
				String b = stack.pop();
				String a = stack.pop();
				int result = 0;
	
				switch(in_arr[i]) {
				case "+" : 
					result = Integer.parseInt(a) + Integer.parseInt(b);
					stack.push(Integer.toString(result));
					System.out.println("+연산진행 : " + result);
					break;
				case "-" : 
					result = Integer.parseInt(a) - Integer.parseInt(b);
					stack.push(Integer.toString(result));
					System.out.println("-연산진행 : " + result);
					break;
				case "*" : 
					result = Integer.parseInt(a) * Integer.parseInt(b);
					stack.push(Integer.toString(result));
					System.out.println("*연산진행 : " + result);
					break;
				}
			}
			else {
				stack.push(in_arr[i]);
				System.out.println("push : " + in_arr[i]);
			}
		}
		
		System.out.print(stack.pop());

	}

}
