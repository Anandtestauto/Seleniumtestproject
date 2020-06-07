package Seljava2020;

public class Egconstructor {
	
	String name;
	
      Egconstructor() {
		
		System.out.println("Inside constructor");
	}
	
      
      
      Egconstructor(String s) {
  		
  	     this.name="anand";
  	}
	
    public void method()
  	{
  		
  		System.out.println("inside method");
  	}
  	
      
      
      /*static
	{
		
		System.out.println("inside static method");
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Egconstructor obj=new Egconstructor();
		obj.method();
		
		Egconstructor obj1=new Egconstructor("arjun");
		System.out.println("The expected string is"+obj1.name);
		
		
	}

}
