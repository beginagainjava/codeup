package Practice;

import java.util.Scanner;

public class _1581 {
	int value;
	
	_1581(int value) {
		this.value = value;
	}
	
	public static void myswap(_1581 a, _1581 b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		_1581 a = new _1581(stdIn.nextInt());
		_1581 b = new _1581(stdIn.nextInt());
		
		myswap(a,b);
		
		System.out.print(a.value+ " " + b.value);

	}

}
