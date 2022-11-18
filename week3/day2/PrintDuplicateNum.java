package week3.day2;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNum {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer>set=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(set.add(arr[i])==false) {
				System.out.println(arr[i]+"is duplicated in the array");
			}
		}
		

	}

}
