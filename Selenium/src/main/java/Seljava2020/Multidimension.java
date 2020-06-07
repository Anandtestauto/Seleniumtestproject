package Seljava2020;

public class Multidimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  // multi dimensional array
		
		
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		
		// to find the length of an array
		
		System.out.println("The number of rows="+a.length);
		System.out.println("The number of columns="+a[0].length);
		
		// to retrieve the elements in 2D array
		
		
		for(int i=0;i<a.length;i++)   //outer for loop
		{
		 for(int j=0;j<a[i].length;j++) // inner for loop
		 {
			 System.out.println(+a[i][j]);
		 }
			
		}
		
		int b[][]= { {10,20},{30,40},{50,60}};
		
		//enhanced  for loop
		
		for(int r[]:b) {   //(10,20)
			{ 
				for(int i:r)
				{
					System.out.println("The elements in array are"+i);
				}
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
