package Firstprogram;

public class Stringinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="this is java progisramae";
       String str2="this is";
       String [] str1=str.split(" ");
       int count=0;
       for(String word:str1) {
    	   if(word.toLowerCase().contains("is")) {
    		   count++;
    	   }
       }System.out.println("the word 'is' appears"+count+ "time");
	}

}
