package Practice;

import java.util.Scanner;

public class _1205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		float a = stdIn.nextFloat();
		float b = stdIn.nextFloat();
		
		float max = Math.max(a, b);
		float min = Math.min(a, b);
		
		float plus = max + min;
		float sub = max - min;
		float mul = max * min;
		float div = max / min;
		float squ = (float) Math.pow(max, min);
		float squ2 = (float) Math.pow(min, max);
		
		float result = Math.max(plus, sub);
		result = Math.max(result, mul);
		result = Math.max(result, div);
		result = Math.max(result, squ);
		result = Math.max(result, squ2);
		
		System.out.printf("%.6f", result);

	}

}
