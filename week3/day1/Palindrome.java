package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		String revvalue = "";
		for(int i=value.length()-1;i>=0;i--){
	
			revvalue = revvalue + value.charAt(i);
		}
			if(value.equals(revvalue)) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			
		}
		
		}
			
		}
		


	


