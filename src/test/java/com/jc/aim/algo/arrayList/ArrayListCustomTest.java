package com.jc.aim.algo.arrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class ArrayListCustomTest {
	@Test
	public void ArrayListCustom() {
		ArrayListCustom expected = new ArrayListCustom();
		ArrayListCustom actual = new ArrayListCustom();

		assertEquals(expected, actual);
	}

	@Test
	public void print() {
		ArrayListCustom a = new ArrayListCustom();
		a.print();
	}

	@Test
	public void printTODO() {
		ArrayListCustom a = new ArrayListCustom();
		a.print();
	}
}
