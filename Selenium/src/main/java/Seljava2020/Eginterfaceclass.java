package Seljava2020;

interface sample1{
	
	
	int x=10;
	public void display1();
	public void display2();
	
	//public void add();
	
}

interface sample2 extends sample1{
	
	public void dsiplay3();
	//public int add();
	int x=100;
		
}


public class Eginterfaceclass implements sample1,sample2 {
	
	public void display1() {
		System.out.println("Interface1 display1");
	}
	
	public void display2() {
		System.out.println("Interface1 display2");
	}
	
	public void display3() {
		System.out.println("Interface2 display3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eginterfaceclass obj1=new Eginterfaceclass();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		
		System.out.println(Sample1.x);
		
		
	
	
	}

}
