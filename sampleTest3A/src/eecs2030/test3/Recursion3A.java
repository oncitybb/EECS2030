package eecs2030.test3;

import java.util.List;


public class Recursion3A {


	private Recursion3A() {
		// empty be design
	}

	/**
	 * Returns the string formed by counting starting at <code>from</code>
	 * up to and including <code>to</code> in increments of 1. Each
	 * number in the string is separated from the next number by a
	 * comma and a space.
	 * 
	 * <pre>
	 * countTo(1, 1)    returns the string equal to "1"
	 * countTo(5, 6)    returns the string equal to "5, 6"
	 * countTo(10, 12)  returns the string equal to "10, 11, 12"
	 * </pre>
	 * 
	 * @param from the number to count from
	 * @param to the number to count to
	 * @return the string formed by repeating the specified string n times
	 * @pre. from is less than or equal to to
	 */
	public static String countTo(int from, int to) {
		if(from == to) {
			return "" + to;
		}else {
			return from + ", " +countTo(from + 1, to);
		}
		
	}





	/**
	 * Removes all duplicated strings from a sorted list of strings
	 * maintaining the sorted order of the strings. If the list contains unique
	 * strings then the list remains unchanged. For example, if t is the list
	 * ["a", "b", "c", "d"] then unique(t) would do nothing. If t is the list
	 * ["w", "w", "w", "x", "y", "y", "z"] then unique(t) would modify t so that
	 * it became the list ["w", "x", "y", "z"].
	 * 
	 * @param t
	 *            a sorted list of strings that the method modifies
	 *            so that it contains no duplicated strings (and the list remains in
	 *            sorted order).
	 */
	public static void unique(List<String> t) {
		if(t.size() < 2) {
			return;
		}
		if(t.get(0).equals(t.get(1))) {
			t.remove(0);
			unique(t);
		}else {
			unique(t.subList(1, t.size()));
		}
	}



}
