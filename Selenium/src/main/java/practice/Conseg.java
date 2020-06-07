package practice;

public class Conseg {

	
	/*Conseg()
	{
	System.out.println("object is cretaed"); // it will be the first statement executed
	}

	public static void main (String[] args)	
	{		
		Conseg c=new Conseg();
	}
	*/
	
	/*int id;
	String name;
	
	void display()
	{
	 System.out.println(id+  " " +name);
	 
	}
	
	public static void main(String[] arg) {
		
		Conseg c1 = new Conseg();
		Conseg c2 = new Conseg();
		c1.display();
		c2.display();
		
		
	}*/
	
	int n:
	String name;

  
    Conseg(int i,String s){
    	n=i;
        name=s;
    }
	
	void display()
	{
		System.out.println(n+" " +name);
		 
	}
	
	public static void main(String[] args){
		
		Conseg c1 = new Conseg(1,"Anand");
		Conseg c2 = new Conseg(2,"Vinod");
		
		c1.display();
		c2.display();
		
	}
		
		
	}
	
	
	

	

