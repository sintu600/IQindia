package Firstprogram;

public class Shiftingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []arr= {4,5,6,7,8,9};
         int k=2;
         for(int i=0;i<k;i++) {
        	  int tem=arr[arr.length-1];
        	  for(int j=arr.length-1;j>0;j--) {
        		  arr[j]=arr[j-1];
        	  }
        	  arr[0]=tem;
         }
         for(int ss:arr) {
        	 System.out.print(ss+" ");
         }
	}

}
