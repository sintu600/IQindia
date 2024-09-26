package Firstprogram;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String str="madam";
             String str1="";
             for(int i=str.length()-1;i>=0;i--) {
            	 char c=str.charAt(i);
            	 str1=str1+c;
            	
             }
             if(str1.equals(str)) {
        		 System.out.println("string is palindrome");
        	 }
        	 else {
        		 System.out.println("string is not palindrome");
        	 }
             
	}

}
