package Seljava2020;

import java.util.Scanner;

import java.util.*;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int num=-25;
		
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter a num");  
				
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("The numbers is positive");
		}
		else {
			System.out.println("The numbers is negative");
			
		}*/
		
		/*int a,b,c;
		
		Scanner sc =new Scanner(System.in);
		
		
		
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Enter the value of c");
		c=sc.nextInt();
		
		
		if(a>b && a>c) {
			System.out.println("A is the greatest");
			
		}
		else if(b>c && b>a) {
			System.out.println("B is the greatest");
		}
		else{
			System.out.println("C is the greatest");
		}*/
		
        int day=2;
		
		switch(day)
		{
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("Invalid week number");
		}

	}

}
