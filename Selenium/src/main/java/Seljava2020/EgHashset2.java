package Seljava2020;

import java.util.*;

public class EgHashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<Integer> hset=new HashSet<Integer>();
		
		hset.add(5);
		hset.add(1);
		hset.add(3);
		hset.add(7);
		hset.add(9);
		
		System.out.println("the elements in hash set are"+hset);
		
		
		// convert to arrady list
		
		// create an array
		
		Integer[] array=new Integer[hset.size()];
		
		// convert to an array
		hset.toArray(array);
		
		// to display array elements are
		
		System.out.println("To display array elements");
		
		for(Integer var:array) {
			System.out.println("the elements in array are=="+var);
		}
		
		
		// converting hash set to tree set
		
		// creating tree set using hash set
		
		Set<Integer> tset=new TreeSet<Integer>(hset);
		
		// to display tree set elements
		
		for(Integer var1:tset) {
	 	System.out.println("Elements in tree set are"+var1);
		
		}
	
		// convering hash set to array list
		
		//create an array list
		
		List<Integer> alist=new ArrayList<Integer>(hset);
		
		
		// to display elements in array list are
		
		System.out.println("The elements in array list are"+alist);
		
		
	}
	}


