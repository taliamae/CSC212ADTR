package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// You might want this; if you're using Map<String, Integer> anywhere...
	// JUnit has an assertEquals(Object, Object) and an assertEquals(int, int).
	// When you give it assertEquals(Integer, int) it doesn't know which to use (but both would be OK!)
	// This method gets around that by forcing the (int, int) version.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testPut() {
		MapADT<String, String> one = new JavaMap<>();
		one.put("orange", "fruit");
		assertEquals(one.size(), 1);
		
	}
	
	@Test
	public void testGet() {
		MapADT<String, String> two = new JavaMap<>();
		two.put("orange", "fruit");
		two.put("apple", "fruit");
		two.put("cucumber", "vegetable");
		assertEquals(two.get("orange"), "fruit");
	}
	
	@Test
	public void testSize() {
		MapADT<String, String> size = new JavaMap<>();
		size.put("orange", "fruit");
		size.put("apple", "fruit");
		size.put("cucumber", "vegetable");
		assertEquals(size.size(), 3);
	}
	
	@Test
	public void testRemove() {
		MapADT<String, String> remove = new JavaMap<>();
		remove.put("orange", "fruit");
		remove.put("apple", "fruit");
		remove.put("cucumber", "vegetable");
		remove.remove("orange");
		assertEquals(remove.size(), 2);
		
	}
}
