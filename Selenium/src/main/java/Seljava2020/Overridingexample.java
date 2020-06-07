package Seljava2020;

/*Method Overriding
--------------------
Rewrite the methods in child classes.
	1) method definition should be same
	2) body should be changed */


class Sum {
	
      void cal(int a,int b) {
    	  
    	  System.out.println("the sum of two values are"+(a+b));
      }
}

class Sub extends Sum{
	
	void cal(int a,int b) {
		
		super.cal(10, 20);
		System.out.println("the sub of two values are"+(a-b));
		
	}
}

class Mul extends Sub{

	void cal(int a,int b) {
		super.cal(35, 25);
		System.out.println("The mul of two values are"+(a*b));
	}
}

public class Overridingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mul m=new Mul();
		m.cal(10, 10);

	}

}
