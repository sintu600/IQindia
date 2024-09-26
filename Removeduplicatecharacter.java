package Firstprogram;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String input = "programming";
		  char[] csar=input.toCharArray();
	        Set<Character> charSet = new HashSet<>();

	        for (char c : csar) {
	            charSet.add(c);
	        }
	        String result = "";
	        for (char c : charSet) {
	            result += c;
	        }

	     System.out.println(result);
	     
//	     LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//
//	        // Adding elements
//	        linkedHashSet.add("Apple");
//	        linkedHashSet.add("Banana");
//	        linkedHashSet.add("Cherry");
//	        linkedHashSet.add("Apple"); // Duplicate, will not be added
//
//	        // Iterating through elements
//	        for (String fruit : linkedHashSet) {
//	            System.out.println(fruit);
//	        }
	     
//	     String ss="sintu";
//	     char[] kk=ss.toCharArray();
//	     System.out.println(kk);
//	     for(char c:kk) {
//	    	 System.out.println(c);
//	     }
//	     
	     
	     
	}

}
