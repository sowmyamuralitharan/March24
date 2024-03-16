package org.has;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasSet {
	
	public static void main(String[] args) {
		
		Set a =  new HashSet();
		
		a.add(10);
		a.add("sowmya");	
		a.add(null);
		a.add(21.234566);
		a.add(true);
		a.add(10);
		a.add(56567667);
		a.add(null);
		a.add("D");
		
		System.out.println(a);
		
		System.out.println("----------------------------------");
		
		for(Object obj : a)
		{
			System.out.println(obj);
		}
		
		System.out.println("----------------------------------");
		
		int size = a.size();
		System.out.println(size);
		
		 a.remove(10);
		 
		 System.out.println(a);
		 
		 Set b = new LinkedHashSet();
		 
		 	b.add(10);
			b.add("String");
			b.add(23.06);
			b.add("s");
			b.add(true);
			b.add("null");
			b.add(null);
			b.add(10);
			b.add(null);
			b.add("s");
			
			System.out.println(b);
		 a.addAll(b);
		
		 System.out.println(a);
		 
		 Set c = new TreeSet();
		 
		c.add(10);
			c.add("String");
			c.add(23.06);
			c.add("s");
			c.add(true);
			c.add("null");
			c.add(null);
			c.add(10);
			c.add(null);
			c.add("s");
		
			
			System.out.println(c);
	}

}
