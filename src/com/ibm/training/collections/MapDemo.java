package com.ibm.training.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
//		Object o1,o2;
//		if(o1.equals(o2)) {
//			System.out.println(o1.hashCode() == o2.hashCode());
//		}
		
//		Map<String,Integer> runsMap = new HashMap<>(); //iteration order is different from insertion order

		Map<String,Integer> runsMap = new LinkedHashMap<>(); //iteration order is different from insertion order
		
		runsMap.put("virat", 67);
		runsMap.put("rohit", 45);
		runsMap.put("bumrah", 31);
		runsMap.put("xavier", 71);
		
		runsMap.put("rohit", 90);
		
		System.out.println("rohit = "+runsMap.get("rohit"));
		System.out.println("xavier = "+runsMap.get("xavier"));
		System.out.println("rahul = "+runsMap.get("rahul"));
		
		System.out.println("Is there run data for virat ? "+runsMap.containsKey("virat"));
		System.out.println("Is there run data for SKY ? "+runsMap.containsKey("sky"));
		
		//runsMap.remove("xavier");
		//System.out.println("Is there run data for xavier ? "+runsMap.containsKey("xavier"));
		
		System.out.println("Has anyone scored exactly 90? "+runsMap.containsValue(90));
		
		System.out.println("_______________ All entries ____________");
				
		Set<String> keys = runsMap.keySet();
		for(String aKey : keys) {
			System.out.println(aKey+" =========> "+runsMap.get(aKey));
		}
		
	}

}
