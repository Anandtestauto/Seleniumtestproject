package Seljava2020;

public class Singledimnsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		System.out.println("The length of an array="+a.length);
		
		int b[]= {10,20,30,40,50,60};
		
		System.out.println("The length of an second array="+b.length);
		
		 
		// to retrive th data from an array throgh classic for loop 
		
		for(int i=0;i<a.length;i++) {
			 System.out.println("The elements are="+a[i]);
	    }
		
		//enhanced for loop
		
		for(int i:b) {
			System.out.println("Th elmnts in  b array are="+i);
		}
	}

}
