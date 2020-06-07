package Seljava2020;

public class Employee {
	
	//LOCAL VARIABLE
	int Eid=10;
	String name="Anand";
	char Grade='A';
	String Dept ="CSE";
	
	public void getValues(int a,String b,char c,String d) {
		
		Eid=a;
		name=b;
		Grade=c;
		Dept=d;
	}
	
	void display(){
		
		System.out.println("THE EMPLOEE ID="+Eid);
		System.out.println("Emploee name="+name);
        System.out.println("The employee grade="+Grade);
        System.out.println("THE EMPLOYEE DEPT="+Dept);
        }

	
	

}
