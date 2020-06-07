package Seljava2020;

import java.util.*;

public class EgTreesset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer> tlist=new TreeSet<Integer>();
		
		tlist.add(5);
		tlist.add(7);
		tlist.add(4);
		tlist.add(2);
		//tlist.add(null);
		
		
		Iterator<Integer> var1=tlist.iterator();
		
		while(var1.hasNext()) {
			System.out.println("The elements in tree set are="+var1.next());
		}
		
		

	}

}
