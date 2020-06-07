package Seljava2020;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		
		//ASSIGN VALUES USING REFERENCE VARIABLE
		e.Eid=20;
		e.name="binoy";
		e.Dept="ECE";
		e.Grade='A';
		
		System.out.println("ASSIGN VALUES USING REFERENCE VARIABLE");
		e.display();
		
		System.out.println("ASSIGN VALUES USING METHOD");
		
		Employee e2=new Employee();
		
		e2.getValues(30,"baji",'A',"CSE");
		e2.display();
	
		
		
	}

}
