package Factorial;

public class Fibnocci {
	public static void main(String[] S) {
		int a = 0;
		int b = 1;
		{
			System.out.println(a);
			System.out.println(b);
			{
				int result = a + b;
				while (result < 10) {
					System.out.println(result);
					a = b;
					b = result;
					result = a + b;
				}
			}

		}

	}
}



