package Practice;

import java.util.Scanner;
import java.util.Stack;

public class _4041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String in_arr[] = sc.nextLine().split("");
		
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < in_arr.length; i++) {
			stack.push(in_arr[i]);
		}
		
		String result = "";
		
		for(int i = 0; i < in_arr.length; i++) {
			
			if(result.equals("") && stack.peek().equals("0"))
				stack.pop();
			else
				result += stack.pop();
		}
		
		String sum_arr[] = result.split("");
		int sum = 0;
		
		for(int i = 0; i < sum_arr.length; i++) {
			sum += Integer.parseInt(sum_arr[i]);
		}
		
		System.out.println(result);
		System.out.print(sum);
		
		
	}

}
