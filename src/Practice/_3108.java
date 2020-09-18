package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class _3108 {
	
	static class Data {
		String code;
		int number;
		String name;
		
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		Data (String code, int number, String name) {
			this.code = code;
			this.number = number;
			this.name = name;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		stdIn.nextLine();
		
		ArrayList<Data> list = new ArrayList<Data>();
		
		for(int i = 0; i < n; i++) {
			String[] in_arr = stdIn.nextLine().split(" ");
			int in_key = Integer.parseInt(in_arr[1]);
			
		//	list.add(new Data(in_arr[0], in_key, in_arr[2]));
			
			if(in_arr[0].equals("I")) {
				if(!list.contains(in_arr)) {
					list.add(new Data(in_arr[0], in_key, in_arr[2]));
				}
				/*
				for(int j = 0; j < list.size(); j++) {
					if(list.get(j).number == in_key) {
						list.remove(i);
						break;
					}
				}
				*/
			} else {
				if(list.contains(in_key)) {
					list.remove(in_key);
				}
				/*
				for(int k = 0; k < list.size(); k++) {
					if(list.get(k).number == in_key) {
						list.remove(k);
						break;
					}
				} list.remove(i);
				*/
			}
			
		}
		

		int d[] = new int[5];
		
		for(int i = 0; i < 5; i++)
			d[i] = stdIn.nextInt() - 1;
		
		Collections.sort(list, new Comparator<Data>() {
			public int compare(Data o1, Data o2) {
				if(o1.number > o2.number)
					return 1;
				else if(o1.number < o2.number)
					return -1;
				else
					return 0;
			}
		});
		
		for(Data x : list) {
			System.out.println(x.code + " " + x.number + " " + x.name);
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(list.get(d[i]).number + " " + list.get(d[i]).name);
		}
		
		

	}

}
