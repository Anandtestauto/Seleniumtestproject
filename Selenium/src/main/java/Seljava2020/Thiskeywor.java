package Seljava2020;

public class Thiskeywor {
	
	
	// this keyword used to differentiate class var and method var
	
	int a,b;  // class var
	
	void getValus(int a,int b) {   //method var
		this.a=a;
		this.b=b;
	}
	
	void printvalues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thiskeywor t=new Thiskeywor();
		t.getValus(10, 20);
		t.printvalues();
	}

}
