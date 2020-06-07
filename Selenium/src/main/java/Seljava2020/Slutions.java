package Seljava2020;

public class Slutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String cname = "testleaf software";
		String replace = cname.replace(" ", "");
		
		System.out.println(replace);
		char[] charArray = replace.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[0] == charArray[i]) {
				count ++;
			}
		}
		System.out.println(count);
	

	}

}
