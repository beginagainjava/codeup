package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _1420 {
	
	static class Student {
		String name;
		int score;
		
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
		
		Student(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i = 0; i < n; i++) {
			String a = stdIn.next();
			int b = stdIn.nextInt();
			list.add(new Student(a,b));
		}
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if(o1.score > o2.score)
					return -1;
				else if (o1.score < o2.score)
					return 1;
				else
					return 0;
			}
		});

		System.out.print(list.get(2).getName());

	}

}
