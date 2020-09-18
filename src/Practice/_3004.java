package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _3004 {
	
	static class Data {
		int number;
		int data;
		
		Data(int number, int data) {
			this.number = number;
			this.data = data;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			list.add(new Data(i, a));
		}
		
		Collections.sort(list, new Comparator<Data>() {
			public int compare(Data o1, Data o2) {
				if(o1.getData() > o2.getData())
					return 1;
				else if(o1.getData() < o2.getData())
					return -1;
				else
					return 0;
			}
		});
		
		int k = 0;
		for(Data x : list) {
			x.setData(k);
			k++;
		}
		
		Collections.sort(list, new Comparator<Data>() {
			public int compare(Data o1, Data o2) {
				if(o1.getNumber() > o2.getNumber())
					return 1;
				else if(o1.getNumber() < o2.getNumber())
					return -1;
				else
					return 0;
			}
		});
		
		for(Data x : list) {
			System.out.print(x.getData() + " ");
		}

	}

}
