package ExceptionHandling;
import java.util.*;
public class hashmaps {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		//Adding key-valur pairs
		map.put("Apple",3);
		map.put("Banana",2);
		map.put("Orange",5);
		/*System.out.println("HashMap:"+map);
		System.out.println("Apple Count:"+map.get("Apple"));// get method
		//checking if a key exists
		if(map.containsKey("Banana")) {
			System.out.println("Banana is in the map.");
		}
		//checking if a value exists
		if(map.containsValue(5)) {
			System.out.println("Value 5 in the map");
		}
		//remove key-value pair
		map.remove("Orange");
		System.out.println("After removing Orange:"+map);
		System.out.println("Size of the Map :"+map.size());*/
		//System.out.println("Iterating using entrySet");{
		//for(Map.Entry<String, Integer> entry:map.entrySet()) {
			//System.out.println(entry.getKey()+":"+entry.getValue());
		map.put("Orange",35);
		System.out.println("Iterating using Keyset:");
		for(String Key:map.keySet()) {
			System.out.println(Key+":"+map.get(Key));
		}
	}
		}
	

	

