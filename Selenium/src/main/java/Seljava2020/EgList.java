package Seljava2020;

import java.util.*;

public class EgList {
	
	
	//List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

    //List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist= new ArrayList<String>();
		
		alist.add(0,"karthi");
		alist.add(1, "ashok");
		alist.add(2,"rahul");
		
		
		System.out.println("THE VALUES ARE="+alist);
		
		for(String i:alist) {
			System.out.println(i);
		}
			
		alist.add("santhosh");
		
		int j=alist.size();
		
		System.out.println("current length of arraylist is="+j);
		
		
		for(String i:alist) {
			System.out.println(i);
		}
		
		
		int post=alist.indexOf("santhosh");
		
		System.out.println("Index of array"+post);
		
		String name=alist.get(0);
		
		System.out.println("Positional value is="+name);
		
		alist.remove(3);
		
		for(String i:alist) {
			System.out.println(i);
		}
		
		
		alist.clear();
		
		
	}
		
		
}

