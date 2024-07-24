package Firstprogram;

import java.util.Arrays;

public class RightsideZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {1,0,2,3,0,4,0,5};
       for(int i =0;i<arr.length;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]<arr[j]) {
    			   int tem=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=tem;
    		   }
    	   }
       }System.out.println(Arrays.toString(arr));
	}

}
