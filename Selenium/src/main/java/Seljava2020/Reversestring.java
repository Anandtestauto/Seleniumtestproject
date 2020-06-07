package Seljava2020;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="palakkad";
		
		int length=name.length();
		
		System.out.println(length);
		
		char[] charArray=name.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			
			System.out.println(charArray[i]);
		}

	}

}
// palakkad  --length--8---   0-7
// [8-1]   8>=0  7
// [7-1]   6>=0  6 
