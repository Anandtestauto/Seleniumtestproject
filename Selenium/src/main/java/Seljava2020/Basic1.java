package Seljava2020;

public class Basic1 {
	
	
	// static var
	static int a;
	
	// instance var
	int b;
	
	//instance method
	
	public void simple()
	{
		//local variable
		int c=10;
		System.out.println("Local var="+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static variable   
		System.out.println("static var="+a);
		
		//static var can also be called using class name or object
		
		System.out.println("Static via class"+Basic1.a);
	
		Basic1 bas=new Basic1();
		
	   System.out.println("Static via obj"+bas.a);
		
		
		
		// instance variable 
		
		System.out.println("instance var="+bas.b);
		
		//local var
		
	    bas.simple();
		
	   	}

}
