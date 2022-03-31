package mc.ys.lesson5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMapTest ht = new HashMapTest();
		
		ht.test1();
	}

	public void test1() {
		System.out.println("HashMap Test");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//create
		map.put("one", 10);
		map.put("two", 2);
		map.put("three", 3);
		//size
		int size = map.size();
		System.out.printf("map size is %d %n", size);
		//read
		int value = map.get("one");
		System.out.printf("read value is %d %n ", value);
		//update
		map.put("one", 1);
		value = map.get("one");
		System.out.printf("update value is %d %n " ,value);
		//delete
		value = map.remove("three");
		System.out.printf("remover value is %d %n", value);
		
	
	}
	
	public void print(HashMap<String,Integer> map) {
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		System.out.println("======================");
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key is %s, value is %d %n",key, value);
			
		}
		System.out.println("======================");
	}
	
	public void printVer2(HashMap<String,Integer> map) {
		Set<Map.Entry<String, Integer>> keys = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = keys.iterator();
		System.out.println("======================");
		while(iter.hasNext()) {
			Map.Entry<String, Integer> me = iter.next();
			System.out.printf("key is %s, value is %d %n",me.getKey(), me.getValue());
			
		}
		System.out.println("======================");
	}
} 
