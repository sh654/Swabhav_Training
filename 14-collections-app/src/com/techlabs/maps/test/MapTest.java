package com.techlabs.maps.test;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map  = new HashMap<Integer, String>();
		
		map.put(3, "Chirag");
		map.put(2, "Shirirsh");
		map.put(1, "Vinayak");
		
		System.out.println(map);
		
		LinkedHashMap<Integer, String> linkmap  = new LinkedHashMap<Integer, String>();
		
		linkmap.put(3, "Chirag");
		linkmap.put(2, "Shirirsh");
		linkmap.put(1, "Vinayak"); 
		
		System.out.println(linkmap);
		
		TreeMap<Integer, String> treemap =new TreeMap<Integer, String>();
		treemap.put(1, "Shivam");
		treemap.put(2, "Kunal");
		treemap.put(3, "Gautam");
		// Sorted on basis of keys 
		System.out.println(treemap);
		
		
		Set<Entry<Integer, String>> enteries = treemap.entrySet();
		
		for(Entry<Integer, String> entry : enteries) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
	}

}
