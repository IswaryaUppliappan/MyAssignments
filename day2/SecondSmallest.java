package week1.day2;

public class SecondSmallest {
	public static void main(String[] args) {
		int temp;
		int a[]= {23,45,67,32,89,22};
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length-1; j++) {
				if(a[i] > a[j+1]) {
					temp = a[i];
					a[i] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	System.out.println("Second smallest number is " + a[1]);
		

	}

}
