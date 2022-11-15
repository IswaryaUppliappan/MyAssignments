package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		 String test = "changeme";
		 String demo=new String("changeme");
		 char[] charArray = demo.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
	
			if(i % 2 != 0) {	
			System.out.println(Character.toUpperCase(charArray[i]));		
			}
			else {
				System.out.println(charArray[i]);
			}								
			}
			
		}

	}


