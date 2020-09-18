package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _3017 {
	
	static class Score {
		
		int number;
		int math;
		int info;
		
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public int getInfo() {
			return info;
		}
		public void setInfo(int info) {
			this.info = info;
		}
		
		Score(int number, int math, int info) {
			this.number = number;
			this.math = math;
			this.info = info;
		}
		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		
		public int getSum() {
			return math + info;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		ArrayList<Score> list = new ArrayList<Score>();
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			list.add(new Score(i+1,a,b));
		}
		
		Collections.sort(list, new Comparator<Score>() {
			public int compare(Score o1, Score o2) {
				if (o1.getMath() < o2.getMath())
					return 1;
				else if (o1.getMath() > o2.getMath())
					return -1;
				else {
					if(o1.getInfo() < o2.getInfo())
						return 1;
					else if(o1.getInfo() > o2.getInfo())
						return -1;
					else {
						if(o1.getNumber() > o2.getNumber())
							return 1;
						else
							return -1;
					}
				}
					
			}
		});
		
		for(Score x : list)
			System.out.println(x.getNumber() + " " + x.getMath() + " " + x.getInfo());

	}

}
