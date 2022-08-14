package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();// created object of ArrayList
		
		al.add("Dipesh");
		al.add(999);
		al.add(100.05);
		al.add(null);
		al.add(null);
		al.add("Dipesh");
		al.add(true);
		al.add('D');
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		
		System.out.println(al.indexOf('D'));
		System.out.println(al.indexOf("Dipesh"));
		System.out.println(al.lastIndexOf("Dipesh"));
		
		System.out.println(al.contains("Dipesh"));
		System.out.println(al.remove(0));// Index Basis
        System.out.println(al);//  index of 0 removed
        
        System.out.println("\n");
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        System.out.println("\n");
        
        // Printing element using for loop(static or hard coding)
        
        for (int i=0;i<=6;i++)
        {
        	System.out.println(al.get(i));
        }
        System.out.println("\n");
        for (int i=0;i<=al.size()-1;i++)
        {
        	System.out.println(al.get(i));
        }
        System.out.println("\n");
        // for each loop
        System.out.println("for each loop output");
        
        for(Object m:al)
        {
        	System.out.println(m);
        }
        System.out.println("\n");
        
        
        //iterator
        System.out.println("iterator ouput");
        Iterator it=al.iterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("\n");	
        	
        	
        //listIterator
        System.out.println("Listiterator output");
        ListIterator li = al.listIterator();
        
        while(li.hasNext())
        {
        	System.out.println(li.next());
        }
	}

}
