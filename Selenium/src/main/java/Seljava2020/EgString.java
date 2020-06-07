package Seljava2020;

public class EgString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="Welcome";
		String s2=" to Java";
		String s4=" welcome ";
		
		//length
		
		System.out.println(s1.length());
		
		//concat
		
		String s3=s1.concat(s2);
		
		System.out.println(s3);
		
		String s5=s4.trim();
		
		System.out.println(s5);
		
		//char at
		
		System.out.println(s5.charAt(2));
		
		// contains works on case sensitive
		
		System.out.println(s5.contains("we"));
		
		System.out.println(s5.contains("We"));
		
		// equals also case snsitive
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		
              String s6="WelcometoJava";
              
              System.out.println(s6.replace("Java", "sel"));
              
              System.out.println(s6.replaceAll("J", "S"));
              
            String s7=  s6.toLowerCase();
            String s8=  s6.toUpperCase() ;
            
            System.out.println(s7);
            System.out.println(s8);
            
           String s9= s6.substring(0, 4);
           
           System.out.println(s9);
        		           
	}

}