package Seljava2020;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=1;
		
		long num8 = 9234567890L;
		float num9 = 45.8F;
		System.out.println(num8);
		System.out.println(num9);
	
		
		
		// Array with for each loop
		int[] num= {1,3,5,7,9,11};
		
		for(int destiny:num) {
			System.out.println("The numbers are"+destiny);
		}
		
		//for loop
		
		for( int i=0;i<=5;i++) {
			System.out.println(+i);
		}
		
		// if ----else if 
		
	    int num1=15;
		int num2=17;
		int num3=19;
		
		if(num1>num2&&num1>num3) {
			System.out.println("The number1 is greater");
		}
		else if(num2>num3&&num2>num1)
		{
		System.out.println("The numner2 is greater");
			 }
		
		else {
			System.out.println("Number 3 is greater");
		}
			
		// while loop
		/*while(j<=5) {
			System.out.println("The elements in while loop are"+j);
			System.out.println("While loop not executed");
			System.exit(j);
		}*/
		
		
		int incrementer =16;
		
		incrementer++;  // incrementer+1
		
		System.out.println("the incremented value is"+incrementer);
		
		System.out.println("added value is:"+incrementer++);
		
		System.out.println("Another version");
		
		System.out.println(+incrementer);
		
		System.out.println("The decremented value is "+incrementer--);
		
		System.out.println(--incrementer);
		
		System.out.println(+incrementer);
		
		
		
		
		
		}
	}


