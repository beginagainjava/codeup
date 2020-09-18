package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//int n = sc.nextInt();
		String in_arr[] = sc.nextLine().split("");
		
		Stack<String> stack = new Stack<>();
		
		
		for(int i = 0; i < in_arr.length; i++) {
			System.out.println(in_arr[i]);
		}
		
		
		for(int i = 0; i < in_arr.length; i++) {
			stack.push(in_arr[i]);
		}
		
		Stack<String> result = new Stack<>();
		
		int count = 1;


		while(stack.isEmpty() == false) {
			if(count % 4 == 0) {
				result.push(",");
			}
			else {
				String str = stack.pop();
				result.push(str);
			}
			
			count++;
		}
		/*
		while(stack.isEmpty() == false) {
			if(count % 4 == 0) {
				result.push(",");
			}
			else {
				result.push(stack.pop());
			}
			
			count++;
		}
		*/
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.pop());
		}
		

	}

}
