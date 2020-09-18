package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class _1805 {
	
	static class Equip {
		private int solid;
		private int gas;
		
		public int getSolid() {
			return solid;
		}

		public void setSolid(int solid) {
			this.solid = solid;
		}

		public int getGas() {
			return gas;
		}

		public void setGas(int gas) {
			this.gas = gas;
		}

		Equip(int solid, int gas) {
			this.solid = solid;
			this.gas = gas;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		ArrayList<Equip> list = new ArrayList<Equip>();
		
		for(int i = 0; i < n; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			list.add(new Equip(a,b));
		}
		
		Collections.sort(list, new Comparator<Equip>() {
			public int compare(Equip o1, Equip o2) {
				if(o1.getSolid() > o2.getSolid())
					return 1;
				else if (o1.getSolid() < o2.getSolid())
					return -1;
				else
					return 0;
			}
		});
		
		for(Equip x : list)
			System.out.println(x.getSolid() + " " + x.getGas());
	}

}
