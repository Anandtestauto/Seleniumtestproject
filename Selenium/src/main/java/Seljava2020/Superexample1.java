package Seljava2020;

class Parent{

	String name="GREEN";    //instance variable
	
	void print(){
		
		System.out.println("Parent class method");
		
	}
}

class child extends Parent{
	
	String name ="BLUE";
	
	void display() {
		System.out.println(name);
		System.out.println(super.name);  // accessing instance var for parent class
		//super.print();
	}
	
void print(){
		
		System.out.println("child class method");
		super.print();
		
	}
}

public class Superexample1 {
	
	//1) super can be used to refer immediate parent class instance variable.
	//2) super can be used to invoke immediate parent class method.
	//3) super() can be used to invoke immediate parent class constructor.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child c =new child();
		c.display();
		c.print();
		

	}

}
