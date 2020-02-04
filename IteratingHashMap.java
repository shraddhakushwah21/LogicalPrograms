package com.java.logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratingHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "shraddha");
		map.put(2, "sonam");
		map.put(3, "Ankit");
		map.put(4, "Anshu");
		map.put(5, "Ankur");
		
		Iterator itr=map.entrySet().iterator();
		System.out.println("Iterating using while() loop::");
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println("Key :: "+entry.getKey()+" value :: "+entry.getValue());
		}
		
		System.out.println("Iterating using for() loop ::");
		for(Map.Entry me:map.entrySet()) {
			System.out.println("Key :: "+me.getKey()+" value :: "+me.getValue());
		}
	}

}
