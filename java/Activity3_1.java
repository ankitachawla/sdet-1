package JavaActivity1;

import java.util.ArrayList;

public class Activity3_1 {
	
	public static void main(String[] args)
	{

	ArrayList <String> MyList = new ArrayList<String>();
	MyList.add("Hello");
	MyList.add("Hello1");
	MyList.add("Hello2");
	MyList.add("Hello3");
	MyList.add("Hello4");
	
	System.out.print("Print all arrayList");
	for (String s:MyList)
	System.out.println(s);
	
	
    System.out.println("3rd element in the list is: " + MyList.get(2));
	
    System.out.println("Is Hello is in list: " + MyList.contains("Hello"));

    System.out.println("Size of ArrayList: " + MyList.size());
   
    MyList.remove("Hello3");
  
    System.out.println("New Size of ArrayList: " + MyList.size());
	
			
}
}
