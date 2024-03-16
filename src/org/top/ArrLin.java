package org.top;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrLin {

	public static void main(String[] args)
	{
		
		List<String> a = new ArrayList();
		
		a.add("Arya");
		a.add("Sowmya");
		a.add("Murali");
		
		
		List<String> b = new LinkedList();
		
		b.add("kanna");
		b.add("Jeya");
		b.add("Arya");
		
		
		
		a.addAll(b);
		System.out.println(a);   //[Arya, Sowmya, Murali, kanna, Jeya, Arya] 
		
		System.out.println("------------------------------------");
		
		a.removeAll(b);
		System.out.println(a);    //[Sowmya, Murali]
		
		b.removeAll(a);
		System.out.println(b); //[kanna, Jeya]   
		
		
		
		a.retainAll(b);
		System.out.println(a);   //[Arya]
		
		
		
		b.retainAll(a);
		System.out.println(b);  //[Arya]
	
		a.clear();
		
		System.out.println(b); //[kanna, Jeya, Arya]
		
		
		
		
	}
}
