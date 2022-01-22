package study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Second2 {
public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("students.txt"));
		
		ArrayList<String> students = new ArrayList<String>(); //list is for interface, arraylist is for implementation.
		//for interface, we could use collection too
		while(in.hasNextLine()) {
			students.add(in.nextLine()); //get value from file
			}
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println("name: "+ students.get(i));
		}
		in.close();
		}	
}

