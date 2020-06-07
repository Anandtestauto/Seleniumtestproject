package Seljava2020;

import java.util.*;

import org.apache.poi.util.SystemOutLogger;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		
		//a=10;;
		//b=20;
		
		
	       System.out.println("Enter the value of a");  
	       
	       a=sc.nextInt();
	       
	       System.out.println("Enter the value of b"); 
	       
	       b=sc.nextInt();

		System.out.println("before swap");
			System.out.println("The value of a is"+a);
			System.out.println("The value of b is"+b);
		
			
		System.out.println("after swap");
		//int c=0;
		c=a;
		a=b;
		b=c;
		
		System.out.println("The value of a is"+a);
		System.out.println("The value of b is"+b);
	}

}

