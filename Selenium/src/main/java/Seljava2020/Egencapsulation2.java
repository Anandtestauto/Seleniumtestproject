package Seljava2020;

public class Egencapsulation2 {
	
	private int rollno;
	private String name;
	private int age;
	
	
	public void setroll(int x) {
		
          rollno=x;
	}
	
	public void setname(String y) {
           name=y;
	}
	
	public void setage(int z) {
           age=z;
	}

    public int getroll() {
    	System.out.println("My age is ="+rollno);
    	return rollno;
    }
    
    public int getage() {
    	System.out.println("My age is ="+age);
    	return age;
    }
    public String getname() {
    	System.out.println("My age is ="+name);
    	return name;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	
    	Egencapsulation obj1=new Egencapsulation();
    	
		obj1.setroll(100);
		obj1.setname("anand");
		obj1.setage(45);
	
		
		obj1.getroll();
		obj1.getname();
		obj1.getage();
		
		
		System.out.println("My roll number is= "  +obj1.getroll());
		System.out.println("My name is= "  +obj1.getname());
		System.out.println("My age is= "  +obj1.getage());

	}

}
