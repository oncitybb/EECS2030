package eecs2030.test3;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class Recursion3ATester {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@Test
	public void test01a_countTo() {
		assertEquals("countTo(1, 1)", 
				"1", Recursion3A.countTo(1, 1));
	}

	@Test
	public void test01b_countTo() {
		assertEquals("countTo(5, 6)", 
				"5, 6", Recursion3A.countTo(5, 6));
	}

	@Test
	public void test01c_countTo() {
		assertEquals("countTo(10, 12)", 
				"10, 11, 12", Recursion3A.countTo(10, 12));
	}

	@Test
	public void test03a_unique() {
		List<String> t = new ArrayList<>();
		Recursion3A.unique(t);
		assertTrue("unique([])",
				t.isEmpty());
	}

	@Test
	public void test03b_unique() {
		List<String> t = new ArrayList<>(
				Arrays.asList("one"));
		Recursion3A.unique(t);
		assertEquals("unique([one])",
				"one", t.get(0));
	}

	@Test
	public void test03c_unique() {
		List<String> t = new ArrayList<>(
				Arrays.asList("one", "two"));
		List<String> exp = new ArrayList<>(
				Arrays.asList("one", "two"));
		Recursion3A.unique(t);
		assertEquals("unique([one, two])",
				exp, t);
	}

	@Test
	public void test03d_unique() {
		List<String> t = new ArrayList<>(
				Arrays.asList("one", "one"));
		List<String> exp = new ArrayList<>(
				Arrays.asList("one"));
		Recursion3A.unique(t);
		assertEquals("unique([one, one])",
				exp, t);
	}


	@Test
	public void test03e_unique() {
		List<String> t = new ArrayList<>(
				Arrays.asList("one", "two", "two"));
		List<String> exp = new ArrayList<>(
				Arrays.asList("one", "two"));
		Recursion3A.unique(t);
		assertEquals("unique([one, two, two])",
				exp, t);
	}

	@Test
	public void test03f_unique() {
		List<String> t = new ArrayList<>(
				Arrays.asList("w", "w", "w", "x", "y", "y", "z", "z"));
		List<String> exp = new ArrayList<>(
				Arrays.asList("w", "x", "y", "z"));
		Recursion3A.unique(t);
		assertEquals("unique([w, w, w, x, y, y, z, z])",
				exp, t);
	}


}
