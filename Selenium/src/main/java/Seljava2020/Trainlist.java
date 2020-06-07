package Seljava2020;

public class Trainlist {
	
	   String[] Trains= {"Aleppy","Manglore","Trivandrum","JammuTaavi"};
	   
	   public void Trainlists() {
	   for (int i=0;i<=Trains.length;i++) {
	    	System.out.println("The list od trains are=="+Trains[i]);
	   }
	   }
	   
	   public void Traintype(String tyofClass){
		   
		       switch(tyofClass){
			   case "Ac":
			        System.out.println("THE CLASS TYPE IS AC");
			   break;
			   case "Sleeper":
				    System.out.println("THE CLASS TYPE IS SLEEPER");
			   break;
			   default:
				   System.out.println("GENERAL CLASS");
			   break;	   
				
	 }
}
	   
	   
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Trainlist c= new Trainlist();
		   c.Trainlists();
		   c.Traintype("Ac");
}

}
