package Practice;

import java.util.Scanner;

public class Valentain_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		double h = stdIn.nextDouble();
		double s = stdIn.nextDouble();
		double t = stdIn.nextDouble();
		double d = stdIn.nextDouble();
		double result = 0;
		
		
		
		if ((d - s * (1 - result/100)) * t >= h) {
			System.out.print("O");
			return;
		}
		else {
			while((d - s * (1 - result/100)) * t < h) {
				result += 0.000001;
			}
		}
		
		System.out.printf("%.06f", result);

	}

}
