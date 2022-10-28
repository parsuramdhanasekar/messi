package Bufferreader;

public class StringBuffers {
	public static void main(String S[]) {
		StringBuffer str = new StringBuffer("Hello Messi");// 1st line
		System.out.println(str);
		System.out.println(str.append("Welcome To Psg"));// adding the string to line
		System.out.println(str.insert(0, "Argentina Has Won The Fifa WorldCup 2022"));// inserting the string into 0th
																						// index
		System.out.println(str.delete(0, 3));// start index,end index
		// System.out.println(str.reverse());//reverse the sentence
		// System.out.println(str.replace(8,18,"java"));
		System.out.println(str.length());// length of the sentence
		System.out.println(str.indexOf("to"));//
		System.out.println(str.charAt(8));//
		System.out.println(str.substring(4));
		System.out.println(str.subSequence(7, 12));

		
	}

}