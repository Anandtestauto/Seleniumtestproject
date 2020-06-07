package Seljava2020;

public class Specificnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={15,25,58,85,45};
		
		int a=58;
		boolean flag=false;
		
		/*for(int i:num) {
			
			if(i==a) {
				flag=true;
				System.out.println("Element found successfully");
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Element not found");
		}*/
		
          for(int i:num) {
			
			if(i==a) {
				System.out.println("Element found");
				break;
			}
			else
			{
				System.out.println("element not found");
			}
          }
	}

}
