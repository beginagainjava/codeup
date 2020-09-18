package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _3130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			if(stack.isEmpty()) {
				stack.push(a);
			} else {
			if(stack.peek() > a) {
				count += stack.size();
				stack.push(a);
			} else {
				while((stack.isEmpty() != true) && stack.peek() <= a) {
					stack.pop();
				}
				count += stack.size();
				stack.push(a);
			}
			
			
			}
		}
		
		System.out.print(count);

	}

}
