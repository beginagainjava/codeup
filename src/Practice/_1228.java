package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _1228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double k = sc.nextDouble();
		double g = sc.nextDouble();
		
		double standard = ((k - 100) * 0.9);
		double result = (g - standard) * 100 / standard;
		
		if(result <= 10)
			System.out.print("����");
		else if(result > 10 && result <= 20)
			System.out.print("��ü��");
		else
			System.out.print("��");
		
		int a[] = {5,3,4,1,2};
		Arrays.sort(a, Comparator);
	}

}
