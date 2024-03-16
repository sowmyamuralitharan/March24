package org.top;

import java.util.ArrayList;
import java.util.List;

public class Arrlist {
	
	public static void main(String[] args)
	{
		List li = new ArrayList();
		
		li.add(10);
		li.add("String");
		li.add(23.06);
		li.add("s");
		li.add(true);
		li.add("null");
		li.add(null);
		li.add(10);
		li.add(null);
		li.add("s");
		
		
			System.out.println("ArrayList items" +li); 
			
			li.set(2, "String");
			System.out.println(li);   //ArrayList items[10, String, 23.06, s, true, null, null, 10, null, s]
		                                    //	[10, String, String, s, true, null, null, 10, null, s]
			
//			li.add(4,"sow");
			
//			System.out.println(li);
			
		/*	int value = li.size();
			System.out.println(value);
			
			int indexOf = li.indexOf("s");
			System.out.println(indexOf);
			
			int lastIndexOf = li.lastIndexOf("s");
			System.out.println(lastIndexOf);
			
			boolean contains = li.contains("null");
			System.out.println(contains);
			
			boolean contains2 = li.contains("sowmya");
			System.out.println(contains2);
			
			li.remove("s");
			System.out.println(li);
			
			Object object = li.get(1);
			System.out.println(object);
		
			Object object2 = li.get(5);
			System.out.println(object2);
			
			System.out.println("********************************");
			
			for(int i=0; i<li.size(); i++)
			{
				Object object3 = li.get(i);
				System.out.println(object3);
			}
			
			*/
			
			
	}

}
