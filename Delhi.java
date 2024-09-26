package Firstprogram;

import java.util.HashSet;

public class Delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		        int[] arr = {3, 4, 5, 3, 10, 7, 8, 10,4};
//		        
//		        for (int i = 0; i < arr.length; i++) {
//		            for (int j = i + 1; j < arr.length; j++) {
//		                if (arr[i] == arr[j]) {
//		                    System.out.println("Duplicate value: " + arr[i] + " at indices " + i + " and " + j);
//		                }
//		            }
//		        }
		  int[] arr = {2, 5, 3, 6, 2, 4, 3, 1};
		    HashSet<Integer> seen = new HashSet<>();
		    for (int num : arr) {
		        if (seen.contains(num)) {
		            System.out.println("First duplicate element: " + num);
		            return;
		        }
		        seen.add(num);
		    }
		    System.out.println("No duplicates found");
		}

		    
	}


