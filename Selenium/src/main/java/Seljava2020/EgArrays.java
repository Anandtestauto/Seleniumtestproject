package Seljava2020;

public class EgArrays {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars= {"Lambogini","BMW","FORD","MARUTHI","TATA","CHERVOLET","NISSAN"};
		
	    System.out.println("First element in array is ="+cars[0]);
	    
	    cars[0]="anand";
	    
	    System.out.println("First element in array is ="+cars[0]);
	    
	    int i=cars.length;
	    
	    System.out.println("The length of an array is=" +i);
	    
	    for(i=0;i<=cars.length;i++) {
	    	
	    	System.out.println("Array element @" + i + "index is="+cars[i]);
	    }
	    
	   /* System.out.println("*************for each loop************");
	    
	    for (String J : cars) {
	    	System.out.println("Array element @" + i + "index is="+cars[i]);
		}*/
	    	   	
}

}
