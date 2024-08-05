package Firstprogram;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String ss= "Ramankumarsinha";
         String result="";
         for(int i =0;i<ss.length();i++) {
        	 char c=ss.charAt(i);
        	 if(i%2==0) {
        		 result=result+Character.toUpperCase(c);
        	 }else {
        		 result=result+Character.toLowerCase(c);
        	 }
         }
         System.out.println(result);
	}

}
