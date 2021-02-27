package JavaActivity1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
                
        Random randomno = new Random();
        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");
        
        while(myObj.hasNextInt()) {
            list.add(myObj.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int index = randomno.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        myObj.close();
}
}
