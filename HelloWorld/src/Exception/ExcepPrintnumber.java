package Exception;

public class ExcepPrintnumber {
	public void 
() {
		System.out.println("Hi");
		try {
			System.out.println("Before Execution");

			int i = 10 / 0;
			System.out.println("Hello");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");

		}
	}

	public static void main(String[] args) {
		ExcepPrintnumber c = new ExcepPrintnumber();
		c.printNumber();
		System.out.println("Hey");

	}

}
