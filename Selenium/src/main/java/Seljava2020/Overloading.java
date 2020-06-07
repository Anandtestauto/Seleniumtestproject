package Seljava2020;

public class Overloading {
	
	
	/*Overloading: crating methods/constructors with the same name with different parameters.

	Advantage:
	-----
	saves memory
	saves time

	1) Number of parameters
	2) data type of parameters   */
	
	void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
    void add(int a, double b) {
		
		System.out.println(a+b);
	}

    void add(double a, double b) {
	
	System.out.println(a+b);
    }

    void add(int a, int b, int c) {
	
	System.out.println(a+b+c);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading o=new Overloading();
		o.add(10, 20);
		o.add(10, 20, 30);
		o.add(10, 30.5);
        o.add(10.5, 50.5);
		
		
		
	}

}
