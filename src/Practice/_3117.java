package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _3117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a == 0) {
				stack.pop();
		//		System.out.println("pop : " + a);
			} else {
				stack.push(a);
		//		System.out.println("push : " + a);
			}
		}
		
		int result = 0;
		
		while(stack.isEmpty() == false) {
			result += stack.pop();
		}
		
		System.out.print(result);
	}

}
