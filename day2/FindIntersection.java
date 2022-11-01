package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
	// a) Declare An array for {3,2,11,4,6,7};	 
	// * b) Declare another array for {1,2,8,4,9,7};
		int[] nums= {3,2,11,4,6,7};
		int[] nums1= {1,2,8,4,9,7};
		 // Declare for loop iterator from 0 to array length
		for (int i = 0; i < nums.length; i++) {
		// Declare a nested for another array from 0 to array length
			
			for (int j = 0; j < nums1.length; j++) {
				//Compare Both the arrays using a condition statement
				if(nums[i] == nums1[j]) {
			// Print the first array (should match item in both arrays)
					System.out.println(nums[i]);
					
			}		
		}
	}

		
	}

}
