package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _3102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i <= n; i++) {
			String in_arr[] = sc.nextLine().split(" ");
			String work = in_arr[0];
			int number = 0;
			
			if(work.equals("push(")) {
				number = Integer.parseInt(in_arr[1]);
				stack.push(number);
			} else if (work.equals("top()")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
			} else if (work.equals("pop()")) {
				stack.pop();
			} else if (work.equals("size()")) {
				System.out.println(stack.size());
			} else if (work.equals("empty()")) {
				System.out.println(stack.isEmpty());
			}
			
		}

	}

}
