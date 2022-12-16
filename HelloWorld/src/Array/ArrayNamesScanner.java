package Array;

import java.util.Scanner;

public class ArrayNamesScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String input[] = new String[length];
		String temp;
		System.out.println("enter tha length");
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				//if(input[i].compareTo(input[i])<0)
				System.out.println("enter tha names");
				String value = sc.next();
				input[i] =  value;
				temp = input[i];
				input[j] = input[i];
				input[j] = temp;
				
				
			}
			System.out.println(input[3]);
			
		}

	}

}
