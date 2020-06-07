package Seljava2020;



public class Orderofexecution {
	
	{
		
	System.out.println("Anonymous block");
		
	}

	
	static
	{
		System.out.println("Static block");
	}
	
	Orderofexecution()
	{
		System.out.println("Constructor block");
	}
	
	public static void main(String[] args) {
		
		Orderofexecution order1=new Orderofexecution();
		
		System.out.println("****************************************************");
		
		Orderofexecution order2=new Orderofexecution();
		
		
//As you can see STATIC block will execute only once when class gets loaded.

//But Anonymous block and Constructor will run every time object of a Class gets created. 
		// anonymus block will get executed first and then constructor.


	}
}
