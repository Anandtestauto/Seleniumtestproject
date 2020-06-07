package Seljava2020;

interface A{
	
	int a=10;  // variables insde intrface are static and final
	
	void method1();  // methods inside interface are abstract by default public accessmodifier
	
}

public class Interfaceexample implements A {
	
	
         public void method1() {
        	   
        	  System.out.println(a); 
           }
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfaceexample a=new Interfaceexample();
		a.method1();

	}

}
