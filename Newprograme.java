package Firstprogram;

public class Newprograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n=5;
            int a =0;
            int b=1;
            System.out.println("fibonacci series " + n +"trms");
            for(int i=1;i<=n;i++) {
            	System.out.print(a+" ");
            	int sum=a+b;
            	a=b;
            	b=sum;
            }
	}

}
