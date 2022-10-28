package ConditionStatement;

public class Reversenumber {
	public static void main(String s[]) {

		System.out.print(printCharReverse("Argentina"));
				
		
	}

	public static String printCharReverse(String name) {
		char array[] = name.toCharArray();


		
		String reverse = " ";
		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}
		return reverse;
	}
}
