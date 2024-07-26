package Firstprogram;

public class Missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the array

	    int[] a = {1,2,3,4,5,7,9,10};

	    // Initialize variables to store sums

	    int ac_sum = 0;

	    int ex_sum = 0;

	    // Calculate the sum of actual elements in the array

	    for(int i = 0; i < a.length; i++) {

	        ac_sum += a[i];

	    }

	    // Calculate the sum of expected elements

	    for(int i = 1; i <= a[a.length - 1]; i++) {

	        ex_sum += i;

	    }

	    // Find the missing number

	    int missing = ex_sum - ac_sum;

	    // Print the missing number

	    System.out.println("Missing No. is " + missing);

	}
}
