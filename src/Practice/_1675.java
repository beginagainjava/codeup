package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class _1675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		String input = stdIn.next();
		String[] part = input.split(" ");
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList charr = new ArrayList();
		int save = 0;
		
		for(int i = 0; i < part.length - 1; i++) {
			save += part[i].length() + 1;
			arr.add(save);
		}
		
		for(int j = 0; j <part.length; j++) {
			for(int k = 0; k <part[j].length(); k++) {
				if((part[j].charAt(k) >= 65 && part[j].charAt(k) <= 67) || (part[j].charAt(k) >= 97 && part[j].charAt(k) <=99)) {
					charr.add((char)(part[j].charAt(k) + 23));
				}
				else {
					charr.add((char)(part[j].charAt(k) - 3));
				}
			}
		}
		
		for(int i = 0; i <arr.size(); i++) {
			charr.add(arr.get(i) -1 , " ");
		}
		for(int i = 0; i < charr.size(); i++) {
			System.out.print(charr.get(i));
		}

	}

}
