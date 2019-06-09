package com.example.collection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * An instance of HashMap has two parameters that affect its performance:
 * initial capacity and load factor.
 * 
 * The capacity is the number of buckets in the hash table, and the initial
 * capacity is simply the capacity at the time the hash table is created.
 * 
 * The load factor is a measure of how full the hash table is allowed to get
 * before its capacity is automatically increased.
 * 
 * When the number of entries in the hash table exceeds the product of the load
 * factor and the current capacity, the hash table is rehashed (that is,
 * internal data structures are rebuilt) so that the hash table has
 * approximately twice the number of buckets.
 * 
 * As a general rule, the default load factor (.75) offers a good tradeoff
 * between time and space costs.
 * 
 * Higher values decrease the space overhead but increase the lookup cost
 * (reflected in most of the operations of the HashMap class, including get and
 * put).
 * 
 * The expected number of entries in the map and its load factor should be taken
 * into account when setting its initial capacity, so as to minimize the number
 * of rehash operations. If the initial capacity is greater than the maximum
 * number of entries divided by the load factor, no rehash operations will ever
 * occur.
 * 
 */
public class HashMapRehashingCls {

	public static Map<Integer, String> map = null;

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		// print map capacity
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);

		map = new HashMap<Integer, String>();

		// print capacity
		Object[] table = (Object[]) tableField.get(map);
		System.out.println(table == null ? 0 : table.length);

		System.out.println("1 ==>" + map.hashCode());
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		System.out.println("9 ==> " + map.hashCode());
		System.out.println(" size " + map.size());
		map.put(10, "Ten");
		map.put(11, "Eleven");
		System.out.println("11 ==> " + map.hashCode());
		System.out.println(" size " + map.size());
		map.put(12, "Twelve");
		System.out.println(map);
		System.out.println("12 ==>" + map.hashCode());
		System.out.println(" size " + map);
		System.out.println(" size " + map.size());
		print();
		map.put(13, "Thirteen");

		// print capacity
		Object[] table1 = (Object[]) tableField.get(map);
		System.out.println(table1 == null ? 0 : table1.length);

		System.out.println("13 ==>" + map.hashCode());
		map.put(14, "fourteen");
		System.out.println(map);
		System.out.println("14 ==>" + map.hashCode());
		System.out.println(" size " + map.size());
		print();
	}

	public static void print() {
		Set<Entry<Integer, String>> integers = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = integers.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
			System.out.println(
					" key : " + entry.getKey() + " Value :" + entry.getValue() + " hashcode :" + entry.hashCode());

		}
	}

}
