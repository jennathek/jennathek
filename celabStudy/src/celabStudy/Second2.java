package celabStudy;

import java.util.Scanner;

public class Second2 {
public static void main(String[] args) {
		
		Scanner in = new Scanner("test.txt");
		
		while(in.hasNextLine());	{
			System.out.println(in.nextLine());
		}
		
		in.close();
	}
}

