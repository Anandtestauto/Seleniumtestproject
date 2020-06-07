package Seljava2020;

public class Smartphone {
	
	String model="SAMSUNG M30S";
	int phoneimei=1234567890;
	boolean screenguard=true;
	char Sletter='S';
	
	public void phonenum() {
		System.out.println("The phone number is:"+phoneimei);
	}
	
	public void callerID(int phoneimei) {
		System.out.println("The caller id is"+phoneimei);
	}
	
	public void acessories(boolean screenguard,char Sletter) {
		
		System.out.println("IS SCREENGUARD"+screenguard);
		System.out.println("THE MODE IS"+Sletter);
	}
	
	public String Modelname() {
		
		System.out.println("The model name is"+model);
		return model;
	}
	
	public int getbatterystrenth(int Strength) {
		
		System.out.println("the battery strength is"+Strength);
		return Strength;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Smartphone s=new Smartphone();
		s.phonenum();
		s.callerID(99999999);
		s.acessories(true, 'c');
		s.Modelname();
	    s.getbatterystrenth(50);	
		
		
		

	}

}
