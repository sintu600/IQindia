package Firstprogram;

public class Practicedoubt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int [] arr = {2,3,4,5,6,7,8,9};
              int len =arr.length;
              int sum =0;
              for(int i =0;i<len;i++) {
            	  if(arr[i]%2==0) {
            		  sum =sum+arr[i];
            	  }
            	  
              }
              System.out.print(sum);
              
	}

}
