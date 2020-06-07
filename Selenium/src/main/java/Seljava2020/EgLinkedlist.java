package Seljava2020;

import java.util.*;

public class EgLinkedlist {
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	LinkedList<String> llist= new LinkedList<String>();
	
	
	llist.add("Steve");
	llist.add("mark");
	
	llist.addFirst("Negan");
	
	llist.addLast("carl");
	
	llist.add(3,"Raj");
	llist.add(4,"sam");
	llist.add(5, "RAJ");
	
	
	// push and pop operation in LinkedList
	
	// push - to adda new element in first
	
	llist.push("New eleemnt");
	
	System.out.println("Linked list after push"+llist);
	
	
	// pop - to remove the first element in linked list
	
	llist.pop();
		System.out.println("Linked list after pop"+llist);	
		
	
	
	
	
	
	
	Iterator<String> literator=llist.iterator();
	
	while(literator.hasNext()) {
		System.out.println(literator.next());
	}
	
	
	System.out.println("The values in linked list are="+llist);
	
	llist.removeFirst();
	llist.removeLast();
	llist.remove(3);
	
	System.out.println("The values in linked list are="+llist);
	
	
    /*This is how to get and set Values*/
	
	llist.addFirst("dinesh");
	llist.addLast("fahad");

	
	Object firstvar=llist.get(0);
	System.out.println("The first element is= "+firstvar);
	
	llist.set(0, "changed element");
	Object firstvarchanged=llist.get(0);
	System.out.println("The first element is= "+firstvarchanged);
	
	// copy the list
	Object str=llist.clone();
    System.out.println("The copied list  is= "+str);
    
    llist.removeFirstOccurrence("Raj");  //CASE SENSIITVE
	System.out.println("The values in linked list are="+llist);
	
	// to display the llist elements in reverse
	
	Iterator it=llist.descendingIterator();
	
	// to display the elements 
	
	while(it.hasNext()) {
	
	System.out.println("the reverse order is"+it.next());
	}
	
	}
	}


