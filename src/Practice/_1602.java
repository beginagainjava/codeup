package Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1602 {
	
	static double abs(double x) {
		if(x >= 0)
			return x;
		else
			return -x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		double x = stdIn.nextDouble();
		
		DecimalFormat df = new DecimalFormat("#.######");
		
		
		
		System.out.print(df.format(abs(x)));

	}

}
