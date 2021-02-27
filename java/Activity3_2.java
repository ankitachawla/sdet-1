package JavaActivity1;

import java.util.HashSet;
import java.util.Set;

public class Activity3_2 {

	public static void main(String [] args)
	{
		Set <String> hs = new HashSet <String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		
		System.out.println("Print all the Hashset");
		for(String s:hs)
		System.out.println(s);
		
		System.out.println("Size of HashSet: " + hs.size());
		
		hs.remove("A");
		hs.remove("G");
		
        if(hs.remove("Z")) {
        	
        	System.out.println("Z removed from the Set");
	
        } else {
	
        	System.out.println("Z is not present in the Set");
	
        }
		
		System.out.println("Size of HashSet: " + hs.contains("B"));
		
		System.out.println("Print all the updated Hashset");
		for(String s:hs)
		System.out.println(s);
		
		System.out.println("Size of HashSet: " + hs.size());
		
		
	}
}
