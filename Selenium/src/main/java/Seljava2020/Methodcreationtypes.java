package Seljava2020;

public class Methodcreationtypes {
	
	
	//case 1: not taking parameters and not returning value
	// case 2: not taking parameters but returnng value
	// case 3: taking parameters but not returning values
	// case 4: taking parameters and returning values
	
	int a=100;
	int b=200;
	
	/*void sum() {      //case1
		int c= a+b;
		System.out.println("The sum of values="+c);
	}*/
	
	
	
     /* int sum(){    //case 2
    	 int c=a+b;
    	 
    	 return c;
    	 
     }*/
	

     /*void sum(int x,int y) {   //case 3
    	 
    	a=x;
    	b=y;
    	System.out.println((a+b));
     }*/
	
	
	
	int sum(int a,int b) {
		
		int c=a+b;
		return c;
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodcreationtypes a= new Methodcreationtypes();
		//a.sum();     case 1
		
		// System.out.println(a.sum());  case 2
		
		//a.sum(500, 600);  // case 3

		int result=a.sum(1, 2) ;
		
		System.out.println(+result);
		
		
	}

}
