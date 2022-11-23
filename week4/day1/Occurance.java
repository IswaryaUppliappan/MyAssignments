package week4.day1;
import java.util.HashMap;

public class Occurance {

	public static void main(String[] args) {
		
		String value = "Welcome to selenium automation";
		char[] strArray = value.toCharArray();
		
		HashMap<Character,Integer>Map=new HashMap<Character,Integer>();
		
		for (Character ch:strArray ) {
			if(Map.containsKey(ch)) {
				Map.put(ch, Map.get(ch)+1);
			}
			else {
				Map.put(ch, 1);
			}
		}
		System.out.println(Map);
			
		}
	}


