package Seljava2020;


class Car{
	
	public int speedLimit() {
		
		return 100;
	}
	
}

public class Ford_overriding extends Car {
	
public int speedLimit() {
		
		return 150;
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car obj1=new Ford_overriding();
	
	int num =obj1.speedLimit();
	
	System.out.println("The spped limit is= "+num);
	
	
	/*Ford_overriding obj2=new Car();
	
	int speed=obj2.speedLimit();
	
	System.out.println("The spped limit is= "+speed);*/
	
	
	
	
	
	
	}

}
