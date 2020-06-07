package Seljava2020;

public class Egencapsulation {
	
	
	private int rollno;
	private String name;
	private int age;
	
	
	public int getroll() {
		return rollno;
     }
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	
	public void setroll(int x) {
		rollno=x;
	}
	
	public void setname(String y) {
		name=y;
	}
	
	public void setage(int z) {
		age=z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Egencapsulation obj1=new Egencapsulation();
	
		obj1.setroll(100);
		obj1.setname("anand");
		obj1.setage(45);
		
		System.out.println("My roll number is= "  +obj1.getroll());
		System.out.println("My name is= "  +obj1.getname());
		System.out.println("My age is= "  +obj1.getage());
	}

}
