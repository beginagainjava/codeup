package Practice;

import java.util.Scanner;

public class _1218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		if(c >= a + b) {
			System.out.print("�ﰢ���ƴ�");
			return;
		}
		
		if (a == b && b == c)
			System.out.print("���ﰢ��");
		else if (a == b || b == c || c == a)
			System.out.print("�̵�ﰢ��");
		else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
			System.out.print("�����ﰢ��");
		else
			System.out.print("�ﰢ��");
		

	}

}
