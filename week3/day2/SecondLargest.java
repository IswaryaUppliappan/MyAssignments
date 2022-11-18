package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		List<Integer>lst=new ArrayList<Integer>();
		
		lst.add(3);
		lst.add(2);
		lst.add(11);
		lst.add(4);
		lst.add(6);
		lst.add(7);
		
		Collections.sort(lst);
	
		for (int i = 0; i < lst.size(); i++) {
			int data = lst.get(i);
					
				}
	System.out.println(lst);
	Collections.sort(lst);
				
	System.out.println("Second largest number is " + lst.get(4));
		
	}

	}


