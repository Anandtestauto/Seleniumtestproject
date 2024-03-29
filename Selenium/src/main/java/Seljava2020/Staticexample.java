package Seljava2020;

public class Staticexample {
	
	static int a=10;  // static varaible
    int b=20; //Non static -varaible


static void m1() // static method
{
	//Staticexample se=new Staticexample();  inside static method we can call non static var by calling obj
	//System.out.println(se.b);
	System.out.println("this is m1 - static method");
}

void m2() //Non-static
{
	System.out.println("this is m2 - Non-static method");
}


void m3()
{
	System.out.println("This m3 method----Non-static");
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
}

public static void main(String[] args) {
	
	
	
	//static methods can access only static stuff
	System.out.println(Staticexample.a);  // System.out.println(a); 
	Staticexample.m1(); // or m1()
	
	//System.out.println(b); incorrect, bcoz b is non-static varaible
	//m2();   incorrect, bcoz m2() is non-static method
	
	
	//static methods can also access non static stuff but through object.
	Staticexample se=new Staticexample();
	System.out.println(se.b); // non static varaible through object
	se.m2(); // non static method through object
			
	se.m3();
	
}
}
}
