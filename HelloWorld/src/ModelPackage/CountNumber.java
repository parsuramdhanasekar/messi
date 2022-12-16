package ModelPackage;

public class CountNumber {
	public static void main(String[] S) {
		String line = "Selenium Web Driver";
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (ch == 'i')
				count++;
		}
		System.out.println(count);

	}

}
