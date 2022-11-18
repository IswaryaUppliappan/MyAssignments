package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// a) Declare An array for {3,2,11,4,6,7};	 
		// * b) Declare another array for {1,2,8,4,9,7};
		List<Integer>lst=new ArrayList<Integer>();
			lst.add(3);
			lst.add(2);
			lst.add(11);
			lst.add(4);
			lst.add(6);
			lst.add(7);
			//int[] nums= {3,2,11,4,6,7};
			Collections.sort(lst);
			//int[] nums1= {1,2,8,4,9,7};
			List<Integer>lst1=new ArrayList<Integer>();
			lst1.add(1);
			lst1.add(2);
			lst1.add(8);
			lst1.add(4);
			lst1.add(9);
			lst1.add(7);
			Collections.sort(lst1);
			 // Declare for loop iterator from 0 to array length
			for (int i = 0; i < lst.size(); i++) {
			// Declare a nested for another array from 0 to array length
				
				for (int j = 0; j < lst1.size(); j++) {
					//Compare Both the arrays using a condition statement
					if(lst.get(i)==lst1.get(j)) {
				// Print the first array (should match item in both arrays)
						System.out.println(lst.get(i));

	}
				}
}
}}