package Array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter tha length ");
		int length = scanner.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
				System.out.println("enter tha value");
                int value = scanner.nextInt();
				array[i] = value;

			}
		System.out.println(array[4]);
		}
		

	}

