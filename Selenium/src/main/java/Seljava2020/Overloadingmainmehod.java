package Seljava2020;

public class Overloadingmainmehod {
	
	// overloading main method we should not use public static void at a time
	
	
	void main(int x) {
		System.out.println(x);
	}
	
	void main(int x,int y) {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Overloadingmainmehod o=new Overloadingmainmehod();
		
		o.main(10);
		o.main(10, 20);
			

}
}
