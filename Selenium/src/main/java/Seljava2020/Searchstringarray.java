package Seljava2020;

public class Searchstringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Test[]= {"Abc","Xyz","JKi","ium"};
		
		String Find="ium";
		
		boolean flag=false;
		
		/*for(String s:Test) {
			
			if(Find==s) {
				flag=true;
				System.out.println("Found the string");
				break;
			}
		}
		
		if(flag=false) {
			System.out.println("string not found");
		}*/
		
		
           for(String s:Test) {
			
			if(Find==s) {
				flag=true;
				System.out.println("Found the string");
				break;
			}
		
		
			else {
			System.out.println("string not found");
		}
		
           }
	}

}
