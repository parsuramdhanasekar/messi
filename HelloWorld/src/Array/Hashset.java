package Array;

import java.util.LinkedHashSet;

public class Hashset {
	public static void main(String[] S) {

		LinkedHashSet<Integer> as = new LinkedHashSet<Integer>();
		as.add(20);
		as.add(30);
		as.add(40);
		as.add(50);
		as.add(55);
		for (Integer integer : as) {
			System.out.println(integer);
		}
	}
	
}
