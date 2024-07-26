package Firstprogram;

public class Nonrepeatingvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr= {4,3,7,11,89,43,2};
   int max=Integer.MIN_VALUE;
    int max1=Integer.MIN_VALUE;
    int max2=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++) {
	  if(arr[i]>max) {
		  max2=max1;
		  max1=max;
		  max=arr[i];
	  }
	  if(arr[i]>max1&&arr[i]!=max) {
		  max2=max1;
		  max1=arr[i];
	  }
	  if(arr[i]>max2&&arr[i]!=max1&&arr[i]!=max) {
		  max2=arr[i];
	  }
  }System.out.println("second max value is :-"+max1);
   System.out.println("highest value :-"+max);
   System.out.println("third highest value :-"+max2);
  
	}

}
