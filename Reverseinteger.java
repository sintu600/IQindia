package Firstprogram;

public class Reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=12345;
       int revrsno=0;
       while(num!=0)
       {
    	    int rem=num%10;
    	    revrsno=revrsno*10+rem;
    	    num=num/10;
       }
       System.out.println(revrsno);
       
	}

}
