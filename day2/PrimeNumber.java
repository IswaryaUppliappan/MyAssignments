package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int Input=13; // Declare an int Input and assign a value 13
		
		// Declare a boolean variable flag as false
		boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= Input/2; i++) {
			// Divide the input with each for loop variable and check the remainder
			int remainder = Input % i;
		
			if (remainder ==0)
			{
				flag= true;// Set the flag as true when there is no remainder
				break;
			}	
		}	
		if (!flag) {
			System.out.println("Prime");
			
		}
		else {
			System.out.println("Not a Prime");
			
		}
}
	
}










