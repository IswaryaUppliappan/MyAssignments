package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Check the given number is palindrome or not 
		int num = 34343;  //Int num =34343
        int actualnumber = num;
		int temp = 0; //Initialize a  temporary variable.

		//Reverse the number (using for loop and add to the temporary variable)
		for (int i = 0; num > 0; i++) {
			temp = (temp * 10) + (num % 10) ;
			num = num /10;
			
		}
		
		
//		Compare the temporary number with reversed number
		if(actualnumber == temp) {
			System.out.println("Palindrome number");//		If both numbers are same, print "palindrome number"
		}


		else {
			System.out.println("not palindrome number");//		Else print "not palindrome number"
		}

		 
		
		
		

	}

}
