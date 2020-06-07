package Seljava2020;

public class Egoverloading {
	
	
	
	public int display1(int i) {
		
		System.out.println("The value of i are"+i);
		return i;
		}
	
    public int display1(int i,int j) {
    	
		int k=i+j;
		System.out.println("The value of i are"+k);
		return k;
		}
	
    public int display1(int a,int b,int c) {
    	
		int d=a+b+c;
		System.out.println("The value of i are"+d);
		return d;
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Egoverloading obj3=new Egoverloading();
		obj3.display1(5);
		obj3.display1(4, 5);
		obj3.display1(10, 15, 20);
	
	
	}
	
	
	
	

}
