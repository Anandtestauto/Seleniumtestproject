package Seljava2020;

public class Thiskeyword {
	
	
	int num=15;
	
	public void display() {
		
		int num=7;
		
		System.out.println("THE NUMBER IS==="+num);
		System.out.println("THE NUMBER IS==="+this.num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword t=new Thiskeyword();
		t.display();
		

	}

}
