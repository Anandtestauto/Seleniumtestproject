package Seljava2020;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50,60};
		int sum=0;
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
		
			sum+=a[i];	
		}
		System.out.println(+sum);
	
		
	}

}
