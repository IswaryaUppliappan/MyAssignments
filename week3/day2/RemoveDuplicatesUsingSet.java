package week3.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet{
	
	public static void main(String[] args) {
		
		String input = "We learn java basics as part of java sessions in java week1";
		
		String[] inputArr = input.split(" ");
		
		Set<String>set=new LinkedHashSet<String>();
		
		for (String s:inputArr) {
			set.add(s);
		}
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
			
		
	}
	
}