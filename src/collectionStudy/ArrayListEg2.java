package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEg2 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(5);
		al.add(3);
		al.add(8);
		al.add(2);
		al.add(7);
		
		System.out.println(al);
		System.out.println("\n");
		
		//For each
		for (Integer i:al)
		{
			System.out.println(i);
		}
		System.out.println("\n");
		
		//Iterator
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\n");
		
		//listIterator
		
		ListIterator<Integer> li =al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		
	}

}
