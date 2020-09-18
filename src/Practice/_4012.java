package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _4012 {
	
	static class Student {
		int score;
		int rank = 1;
		
		Student (int score) {
			this.score = score;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int score = sc.nextInt();
			list.add(new Student(score));
		}
		
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if(o1.getScore() < o2.getScore())
					return 1;
				else if(o1.getScore() > o2.getScore())
					return -1;
				else
					return 0;
			}
		});
		
		int rank = 1;
		
		for(int i = 0; i < n; i++) {
			int j = 1;
			int count = 0;
			while(list.get(i).getScore() == list.get(j).getScore()) {
				count++;
			}
		}

	}

}
