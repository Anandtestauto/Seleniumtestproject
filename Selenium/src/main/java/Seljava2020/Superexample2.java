package Seljava2020;

class Animal{
	
	Animal(){
		System.out.println("Animal class created when object created for dog class");
	}
}

class Dog extends Animal{
	
	Dog(){
		super();  // invoking  parent class constructor
		System.out.println("Dog class created when object created");
	}
	
	
	//super() can be used to invoke immediate parent class constructor.
	
}



public class Superexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d=new Dog();
		
	}

}
