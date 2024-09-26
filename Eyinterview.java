package Firstprogram;

import java.util.HashMap;
import java.util.Map;

public class Eyinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Automation";
		 Map<Character,Integer>repch= new HashMap<>();
         for(int i=0;i<str.length();i++) {
       	  char c=str.charAt(i);
       	  if(repch.containsKey(c)) {
       		  repch.put(c, repch.get(c)+1);
       	  }else {
       		  repch.put(c, 1);
       	  }
       	  
         }
         for(Character ss:repch.keySet()) {
         System.out.println(ss+":"+repch.get(ss));
         }
	}

}
