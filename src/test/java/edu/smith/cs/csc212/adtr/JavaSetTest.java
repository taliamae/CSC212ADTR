package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testInsertOnce() {
		SetADT<String> one = new JavaSet<>();
		one.insert("A");
		assertEquals(one.size(), 1);
	}
	
	public void testInsertTwice() {
		SetADT<String> two = new JavaSet<>();
		two.insert("A");
		two.insert("A");
		assertEquals(two.size(), 1);
	}
	
	@Test
	public void testContains() {
		SetADT<String> con = new JavaSet<>();
		con.insert("A");
		assertTrue(con.contains("A"));
		
	}
	
	@Test
	public void testRemove() {
		SetADT<String> bye = new JavaSet<>();
		bye.insert("A");
		bye.remove("A");
		assertEquals(bye.size(), 0);
	}
	
}
