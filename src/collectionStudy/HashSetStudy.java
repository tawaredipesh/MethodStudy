package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy 
{

	public static void main(String[] args) 
	{   
		
		
		HashSet hs = new HashSet();//import java.util.HashSet
		
		hs.add("New York");
		hs.add(true);
		hs.add(567);
		hs.add(789.123);
		hs.add(567);//duplicate value
		hs.add('V');
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		
		// does not supports for loop--> get method is not available.

		for(Object w:hs)
		{
			System.out.println(w);
		}
	    System.out.println("\n");
	    
		// iterator
	
		Iterator it = hs.iterator();//import java.util.Iterator;
		{
		 System.out.println(it.next());   	
		}
		
		
	}

}
