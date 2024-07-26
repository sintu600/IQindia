package Firstprogram;

public class Threearrayprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {0,1,2,3,-1,-4};
         int len =arr.length;
         int positive=0;
         int negative=0;
         for(int i=0;i<len;i++) {
       	 if(arr[i]>positive) {
        		 positive++;
       	 }
        	 if(arr[i]<negative) {
        		 negative++;
        	 }
         }
         System.out.println(positive);
         System.out.println(negative);
	}

}
