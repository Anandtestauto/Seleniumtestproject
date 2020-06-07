package Seljava2020;

public class MaxandMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int array[]={10,100,20,50,5,60};
		
		//Max value in array
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
		    if (array[i] > max) 
		    {
		      max = array[i];
		    }
		}
		
		System.out.println("Max Element in array:" +max);
		
		// Min value in array
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
		    if (array[i] < min) 
		    {
		      min = array[i];
		    }
		}
		
		System.out.println("Min Element in array:" +min);


	}

}
