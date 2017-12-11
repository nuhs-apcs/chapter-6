package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.SimpleIntegerList;

public class SimpleIntegerListTest {

	@Test
	public void testList() {
		SimpleIntegerList list = new SimpleIntegerList();
		
		for (int i = 1; i <= 100000; i++) {
			list.add(i);
		}
		
		assertEquals("size() failed", 100000, list.size());
		
		list.set(0, 20);
		assertEquals("set() failed", 20, list.get(0));
		
		list.add(0, 50);
		assertEquals("add() with two arguments failed", 50, list.get(0));
		assertEquals("add() with two arguments failed", 20, list.get(1));
	
		list.remove(1);
		assertEquals("remove() failed", 1, list.get(1));
		assertEquals("remove() failed", 2, list.get(2));
	
		list.clear();
		assertEquals("clear() failed", 0, list.size());
		
		list.add(1);
		list.add(2);
		list.add(25);
		assertEquals("toString() failed", "[1, 2, 25]", list.toString());
	}
}
