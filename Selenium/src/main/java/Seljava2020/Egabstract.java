package Seljava2020;

abstract class Sample{
	
	abstract void display();
	
	public void show() {
		System.out.println("Concrete method");
	}
}

public class Egabstract extends Sample {
	
  public void display() {
	 // super.show();
	  System.out.println("abstract method defined in subclass");
  }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Egabstract obj1=new Egabstract();
        obj1.display();
        obj1.show();
		
		
		// cannot instantiate abstract class
		/*Sample obj2=new Sample();
		obj2.display();
		obj2.show();*/
		
	}

}
