package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _3016 {
	
	static class Student {
		String name;
		int[] score = new int[3];
		int[] rank = {1,1,1};
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		Student(String name, int[] score) {
			this.name = name;
			this.score = score;
		}
		
		public String toString() {
			return name + " " + rank[0] + " " + rank[1] + " " + rank[2];
		}
		
		
	}
	
	static void rankCompare(ArrayList<Student> list, int n) {
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j <list.size(); j++) {
				if(i == j)
					continue;
				
				if(list.get(i).score[n] < list.get(j).score[n])
					list.get(i).rank[n]++;
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		
		for(int i = 0; i < n; i++) {
			String a = stdIn.next();
			int[] b = new int[4];
			for(int j = 0; j < 3; j++) {
				b[i] = stdIn.nextInt();
			}
			
			list.add(new Student(a ,b));
		}
		
		for(int i = 0; i < 3; i++)
			rankCompare(list, i);
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if (o1.rank[0] > o2.rank[0])
					return 1;
				else if (o1.rank[0] < o2.rank[0])
					return -1;
				else
					return 0;
			}
		});
		
		for(Student x : list)
			System.out.println(list.toString());
		
		System.out.print(list.get(0).toString());

	}
	
	

}
