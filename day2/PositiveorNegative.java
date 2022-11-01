package week1.day2;

public class PositiveorNegative {

	public static void main(String[] args) {
//		 1. Initialize a number, say, int number= 35; 
		int number =35;
//		 2. If a number is positive, print "The number is positive" 
		if(number > 0)
		{
			System.out.println("The number is positive");
		}
//		 If it nether negative nor positive, print as "The number is neither positive nor negative" 

		else if(number<0)
		{
			System.out.println("The number is negative");
		}
//		 If a number is negative, print "The number is negative"
		else 
		{
			System.out.println("The number is neither positive nor negative");
		}

	}

}
