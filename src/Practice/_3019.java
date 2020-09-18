package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _3019 {
	
	static class Data {
		String memo;
		int[] date = new int[3];
		int rank;
		
		Data(String memo, int[] date) {
			this.memo = memo;
			this.date = date;
		}

		public String getMemo() {
			return memo;
		}

		public void setMemo(String memo) {
			this.memo = memo;
		}

		public int[] getDate() {
			return date;
		}

		public void setDate(int[] date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Data [memo=" + memo + ", date=" + Arrays.toString(date) + ", rank=" + rank + "]";
		}
		
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		for(int i = 0; i < n; i++) {
			String a = stdIn.next();
			int[] b = new int[3];
			for(int j = 0; j < 3; j++) {
				b[j] = stdIn.nextInt();
			}
			list.add(new Data(a,b));
			list.get(i).rank = i;
		}
		
		Collections.sort(list, new Comparator<Data>() {
			public int compare(Data o1, Data o2) {
				if(o1.date[0] > o2.date[0])
					return 1;
				else if(o1.date[0] < o2.date[0])
					return -1;
				else {
					if(o1.date[1] > o2.date[1])
						return 1;
					else if(o1.date[1] < o2.date[1])
						return -1;
					else {
						if(o1.date[2] > o2.date[2])
							return 1;
						else if(o1.date[2] < o2.date[2])
							return -1;
						else {
							return o1.getMemo().compareTo(o2.getMemo());
						}
							
					}
				}
			}
		});

		for(Data x : list) {
			System.out.println(x.getMemo());
		}
		

	}

}
