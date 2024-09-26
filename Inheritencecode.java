package Firstprogram;

class Sintu{
	public void formula() {
		int a=10;
		int b=20;
		System.out.println("areaof reactangle"+a*b);
	}
}

class Bali extends Sintu{
	public void upgradedformula() {
		int a=10;
		int b=20;
		System.out.println("perimeter of rectangle"+2*(a+b));
	}
}

class Piyush extends Bali{
	public int a;
	public int b;
	public Piyush(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("area of square"+(a*a));
		System.out.println("perimeter of aquare"+4*b);
		
	}
}
	
public class Inheritencecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      
       Piyush pp=new Piyush(10,20);
       
       pp.formula();
       pp.upgradedformula();
       
	}

}
