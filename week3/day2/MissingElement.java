package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(6);
		lst.add(8);

		Collections.sort(lst);
		
		for (int i = 0; i < lst.size()-1; i++) {
			if (lst.get(i)+1 != lst.get(i+1)) {
				System.out.println("Missing number is " + (i+1));
				break;
			}
		}

	}

}
