package Seljava2020;

public class Oveloadingconstruvtor {
	
	
	Oveloadingconstruvtor(){
		System.out.println("Default constutor");
	}
	
	
	Oveloadingconstruvtor(int a,int b){
		System.out.println(a+b);
	}
	
	Oveloadingconstruvtor(int a,double b){
		System.out.println(a+b);
	}
	
	Oveloadingconstruvtor(double a,double b){
		System.out.println(a+b);
	}
	
	Oveloadingconstruvtor(int a,int b, int c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oveloadingconstruvtor o=new Oveloadingconstruvtor();  
		
		// new object is created will invoke default constructor
		
		Oveloadingconstruvtor o1=new Oveloadingconstruvtor(10,20);

		Oveloadingconstruvtor o2=new Oveloadingconstruvtor(11.5,22.5);

		
		
	}

}
