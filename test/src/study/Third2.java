package study;

import java.util.LinkedList;

public class Third2 {
public static void main(String[] args)	{
	
	
	LinkedList<String> names = new LinkedList<String>();
	names.push("Caleb"); //first in last out (stack)
	names.push("Jenna");
	names.push("Rachel");
	
	System.out.println(names.pop()); //this prints person who is on the top stack
	System.out.println(names.remove());
	System.out.println(names.removeFirst()); //pop = removeFirst
	
	
}
}
