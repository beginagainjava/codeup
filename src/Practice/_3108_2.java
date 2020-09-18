package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class _3108_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = stdIn.nextInt();
		stdIn.nextLine();
		
		for(int i = 0; i < n; i++) {
			String[] in_arr = stdIn.nextLine().split(" ");
			int in_key  = Integer.parseInt(in_arr[1]);
			if(in_arr[0].equals("I")) {
				if(!student.containsKey(in_key)) {
					student.put(in_key, in_arr[2]);
				}
			} else {
				if(student.containsKey(in_key)) {
					student.remove(in_key);
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			list.add(stdIn.nextInt());
		}
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(student);
		Iterator<Integer> iterKey = tm.keySet().iterator();
		int count = 1;
		
		while(iterKey.hasNext()) {
			Integer key = iterKey.next();
			if(list.contains(count)) {
				System.out.println(key + " " + tm.get(key));
			}
			count++;
		}

	}

}
