package Seljava2020;

public class Egstatic { 
	
	
    /*static void method() {
    	System.out.println("Static block");
    }*/
	
	
	static int var1;
	static String var2;
	
	static void display1() {
		
	  System.out.println("Inside block1");
	  var1=44;
	  var2="Block1";
	}
	
	static void display2() {
		
		System.out.println("Inside block2");
		var1=55;
		var2="Block2";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // method();
		
		display1();
		display2();
		
		System.out.println("The var1 value is"+var1);
		System.out.println("The var2 value is"+var2);
		
		
		
		
	}

}
