package Seljava2020;

public class Staticexampl {
	
	
	static int a=10;  //static var
	
	int b=20;
	
	static void m1() {
		System.out.println("static method");
	}

	void m2() {
		System.out.println("non static method");
	}
	
	// Non static methods can access both static & non static stuff directly.
	
	
	void m3() {
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) static methods can access only static stuff(directly- without creating an object).
		
		System.out.println(a);
		//System.out.println(b);
		
		m1();
		
		
	//	2) static methods can also access non static stuff but through object.
		
		Staticexampl e=new Staticexampl();
		
		System.out.println(e.b);
		e.m2();
		
		e.m3();
		
		
		
		

	}

}
