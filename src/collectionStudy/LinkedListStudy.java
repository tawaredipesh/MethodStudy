package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();// import java.util.LinkedList 
		
		ll.add("Mumbai");
		ll.add('D');
		ll.add(456);
		ll.add(789.123);
		ll.add(true);
		ll.add(456);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(3));//Returns the element at the specified position in this list.
        System.out.println(ll.peek()); //Retrieves(to fetch), but does not remove, the head (first element) of this list.
        System.out.println(ll);
        System.out.println(ll.peekLast());//Retrieves, but does not remove, the last element of this list,or returns null if this list is empty.
        System.out.println(ll.poll());//Retrieves and removes the head (first element) of this list.
        System.out.println(ll);
        System.out.println(ll.pollLast());//Retrieves and removes the last element of this list,or returns null if this list is empty.
        System.out.println(ll);
        System.out.println(ll.size());//Returns the number of elements in this list.
        System.out.println("\n");
        System.out.println(ll.pop());//Pops an element from the stack represented by this list. In otherwords, removes and returns the first element of this list.
        
        
        //for loop
        System.out.println("For Loop");
        for (int i=0;i<=5;i++)
        {
        	System.out.println(ll.get(i));
        	
        }
        System.out.println("\n");
        
        //for each 
        System.out.println("For each ");
        for(Object l:ll)
        {
        	System.out.println(l);
        }
        System.out.println("\n");
        
        //iterator 
        System.out.println("iterator");
        Iterator it = ll.iterator();//import java.util.Iterato
        while (it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("\n");
        
        //listIterator
        System.out.println("listIterator");
        
        ListIterator li =ll.listIterator();//import java.util.ListIterator
        while (li.hasNext())
        {
        	System.out.println(li.next());
        }
        
        
        
        	
        	
     	}

}
