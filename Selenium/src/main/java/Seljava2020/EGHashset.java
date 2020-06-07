package Seljava2020;

import java.util.*;

public class EGHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//HashSet doesn’t maintain any order, the elements would be returned in any random order.
	//allow null values
		
		HashSet<String> hset=new HashSet<String>();
		
		hset.add("san");
		hset.add("ban");
		hset.add("can");
		hset.add("Zan");
		hset.add("ban");
	    hset.add(null);
		
		System.out.println("the elements in hash set are"+hset);
		
		
		for(String s:hset) {
			System.out.println("The elements are= "+s);	
		}
		
		
		/*Iterator<String> var=hset.iterator();
		
		while(var.hasNext()) {
			System.out.println("The elements in hset through while loop are= "+var);	
		}*/
		
		
		
		
		// to clear all elements
		
		hset.clear();
		System.out.println("the elements in hash set are"+hset);		

	}

}
