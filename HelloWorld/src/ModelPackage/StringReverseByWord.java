package ModelPackage;

public class StringReverseByWord {
	public static void main(String[] S) {
		String line = "Selenium Web Driver";
		String[] ch = line.split(" ");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i] + " ");
		}
	}

}
