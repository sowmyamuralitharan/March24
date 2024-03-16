package org.has;

import java.util.HashMap;
import java.util.Map;

public class HasMapss {
	
	public static void main(String[] args)
	{
		
		Map<Integer, String> kv = new HashMap();
		
		kv.put(1,"Arya");
		kv.put(2, "Murali");
		kv.put(3,"Siranjeevi");
		kv.put(null, "Swathi");
		kv.put(4, "Sowmya");
		kv.put(4, null);
		kv.put(5, "Murali");
		kv.put(6, null);
		kv.put(null,null);
		
		System.out.println(kv);
	}

}
