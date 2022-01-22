package study;
import java.util.Scanner;
	public class first {
		public static void main(String [] args)	{ //void: return type (nothing)
			System.out.println("Hello World"); 
			
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			
			System.out.println("review" +" "+ s);
			
//			String t = new String("hey"); //invoking string
//			int x = 5; //declared and initialized
//			int a;
//			a = 4;
//			char tgg = 't';
//			double d = 5.5;
//			float dd = 5.5f;
//			
//			Scanner qq = new Scanner(System.in);
//			String qw = in.nextLine();
			
			
//			if(s.equals("Jenna"))	{
//				System.out.println("Hey Jenna");
//			} else if(s.equals("Mari")){
//				System.out.println("Hey Mari");
//			} else {
//				System.out.println("You're not welcome here.");
//			}
			
			
//			int i = 0; //initialization
//			while(i < 10)	{ //condition
//				System.out.println("i is: " + i);
//				i++; //update
//			}
			
			
//			for(int i = 0; i < 10; i++)	{
//				System.out.println(i);
//			}
//			
			
			
			int i = 1; //initialization
			int t = 0;
				
			do {
				System.out.println("i is: " + i + t);
				i++;
				t++;
			} while(i < 10);	{ //When condition evaluates to false, control passes to the statement following the do...while.
			}
			
			
			in.close(); //memory of in isn't used -> wasting memory -> so close it
			
		}
	}

