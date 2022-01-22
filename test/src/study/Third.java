package study;

import java.io.FileNotFoundException;
import java.util.LinkedList;

public class Third {
public static void main(String[] args) throws FileNotFoundException {
	
	LinkedList<String> names = new LinkedList<String>();
	names.add("Caleb"); //first in first out (queue)
	names.add("Jenna");
	names.add("Rachel");
	
	System.out.println(names.remove()); //this prints person who is out from queue
	System.out.println(names.remove());
	System.out.println(names.remove());
	System.out.println(names.remove()); //doesn't work for 4th

}
}
