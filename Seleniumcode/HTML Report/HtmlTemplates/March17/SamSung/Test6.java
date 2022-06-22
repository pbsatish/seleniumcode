package SamSung;
//import MercuryDemoTours;


import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;


public class Test6 {
	
	@Test 
	public void hello()
	{
		/*
		List<Map<String,List<String>>> list = new ArrayList<Map<String,List<String>>>();
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<String> arraylist1 = new ArrayList<String>();
		
		arraylist1.add("1");
		arraylist1.add("Step 1");
		arraylist1.add("Details1");
		arraylist1.add("Pass 1");
		arraylist1.add("Pass ScreenShot 1");
		arraylist1.add("Date Time 1");
		map1.put("TC01",arraylist1);
		list.add(map1);
		
		
		arraylist1.add("2");
		arraylist1.add("Step 2");
		arraylist1.add("Details2");
		arraylist1.add("Pass2");
		arraylist1.add("Pass ScreenShot2");
		arraylist1.add("Date Time2");
		map1.put("TC02",arraylist1);
		list.add(map1);
		
		 
		System.out.println("Key-Value pairs: "+map1.entrySet());  */
		
		List<String> arraylist1 = new ArrayList<String>();
		
		ListMultimap<String, List<String>> map = ArrayListMultimap.create();
		
		arraylist1.add("1");
		arraylist1.add("Step 1");
		arraylist1.add("Details1");
		arraylist1.add("Pass 1");
		arraylist1.add("Pass ScreenShot 1");
		arraylist1.add("Date Time 1");
		map.put("TC01",arraylist1);
		
		
		List<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("2");
		arraylist2.add("Step 2");
		arraylist2.add("Details2");
		arraylist2.add("Pass 2");
		arraylist2.add("Pass ScreenShot 2");
		arraylist2.add("Date Time 2");
		map.put("TC01",arraylist2);
		System.out.println("  Key & Value "+ map.entries());
		
		
		List<String> arraylist3 = new ArrayList<String>();
		arraylist3.add("3");
		arraylist3.add("Step 3");
		arraylist3.add("Details3");
		arraylist3.add("Pass 3");
		arraylist3.add("Pass ScreenShot 3");
		arraylist3.add("Date Time 3");
		map.put("TC01",arraylist3);
		
		System.out.println("  Key & Value "+ map.entries());
		
		
		
		//list.add(map1);
		

        // Add pairs to ListMultimap.
       // map.put("cat", 5);
       // map.put("dog", 10);
        //map.put("cat", 20);

        // Get list at this key.
        // ... Iterate over its values.
     //   List<Integer> list = map.get("cat");
       /*
		for (String value : arraylist1) {
            System.out.println(value);
        }

        
        if (map.containsKey("TC01")) {
            System.out.println(true);
        }
        
        */
        
	}
	
	

}

	
	