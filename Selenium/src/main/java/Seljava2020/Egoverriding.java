package Seljava2020;


/*Method Overriding is an example of runtime polymorphism. 
 * When a parent class reference points to the child class object then the call 
 * to the overridden method is determined at runtime, because during method call
 *  which method(parent class or child class) is to be executed is determined by 
 *  the type of object. This process in which call to the overridden method is 
 *  resolved at runtime is known as dynamic method dispatch.*/


class Base{

public void display() {
	System.out.println("parent class method");
}

}

public class Egoverriding extends Base {
	
	public void display() {
		System.out.println("Child class method");
	}
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Base obj1=new Base();
	obj1.display();
	
	Egoverriding obj2=new Egoverriding();
	obj2.display();
	
	}

}
