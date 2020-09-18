package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _3015 {
	
	static class Student {
		
		int number;
		String name;
		int score;
		
		Student(int number, String name, int score) {
			this.number = number;
			this.name = name;
			this.score = score;
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
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i = 0; i < n; i++) {
			String a = stdIn.next();
			int b = stdIn.nextInt();
			list.add(new Student(i, a, b));
		}
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if(o1.getScore() < o2.getScore())
					return 1;
				else if (o1.getScore() > o2.getScore())
					return -1;
				else
					return 0;
			}
		});
		
		for(int i = 0; i < m; i++) {
			System.out.println(list.get(i).getName());
		}

	}

}
