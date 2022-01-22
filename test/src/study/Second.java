package study;

import java.util.Scanner;

public class Second {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give us a size.");
		int size = in.nextInt(); //input value from the question above becomes the value of the "size"
		
		// size from above is going to be the value of grades
		int[] grades = new int[size]; // both are used but this one is prefered in java.
		//int scores[];
		
		System.out.println("Enter " + size + " numbers. Press enter after each.");
		for(int i = 0; i < size; i++) {
			grades[i] = in.nextInt(); //size is the amount of the numbers that should be put.
		}
		
		in.close();
	
		for(int i = 0; i < size; i++) {
			System.out.println(grades[i]); //print the same numbers that put above.
	}
}
}
