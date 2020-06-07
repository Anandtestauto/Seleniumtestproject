package Seljava2020;


class Base1{
	
	//int age;
	

	public void display()
	{  	String Name="anand";
        System.out.println("My name is"+Name);
	}
	
    public int display1(int i) {
		
		System.out.println("The value of i are"+i);
		return i;
		}
		
}


class Base2 extends Base1{
	
	public void display()
	{  	//String Name="anand";
		super.display();
		super.display1(5);
        System.out.println("*************I am in base2************");
	}
	
	  public int display1(int i,int j) {
	    	
			int k=i+j;
			System.out.println("The value of i are"+k);
			return k;
			}
		
	
}

public class Ehinheritance extends Base2 {
	
	public void display()
	{  
		super.display();
		super.display1(10, 20);
		System.out.println("*************I am in base 3*************");
		String Desig="Engineer";
		System.out.println("My desig is"+Desig);
	}
	
public int display1(int a,int b,int c) {
    	
		int d=a+b+c;
		System.out.println("The value of i are"+d);
		return d;
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ehinheritance obj2=new Ehinheritance();
		obj2.display();
		obj2.display1(10, 20, 30);

	}

}
