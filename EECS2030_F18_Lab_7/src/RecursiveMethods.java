import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Requirement:
 * You are required to implement all methods recursively.
 * You receive a zero if there is any occurrence of a loop (e.g., for, while).  
 */
public class RecursiveMethods {
	/**
	 * Return an array storing the first n numbers in a Fibonacci sequence. The
	 * Fibonacci starts with the first two numbers being 1 and 1, then starting from
	 * the 3rd number, it is the sum of the previous two numbers. You can assume
	 * that n is positive. e.g., fibArray(5) returns an array {1, 1, 2, 3, 5}.
	 * 
	 * @param n the first n Fibonacci numbers
	 * @return an array representing the first n Fibonacci numbers
	 * 
	 *         You are forbidden to use the fibList method below to solve this
	 *         problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public int[] fibArray(int n) {
		/* Your Task. */
		if (n <= 1) {
			return new int[] { 1 };
		} else if (n == 2) {
			return new int[] { 1, 1 };
		} else {
			int[] ans = Arrays.copyOf(fibArray(n - 1), fibArray(n - 1).length + 1);
			ans[ans.length - 1] = ans[ans.length - 2] + ans[ans.length - 3];
			return ans;
		}
	}

	/**
	 * Return a list storing the first n numbers in a Fibonacci sequence. The
	 * Fibonacci starts with the first two numbers being 1 and 1, then starting from
	 * the 3rd number, it is the sum of the previous two numbers. You can assume
	 * that n is positive. e.g., fibList(5) returns a list {1, 1, 2, 3, 5}.
	 * 
	 * @param n the first n Fibonacci numbers
	 * @return a list representing the first n Fibonacci numbers
	 * 
	 *         You are forbidden to use the fibArray method above to solve this
	 *         problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public List<Integer> fibList(int n) {
		/* Your Task. */
		List<Integer> ans = new ArrayList<>();
		if (n == 1) {
			ans.add(1);
		} else if (n == 2) {
			ans.add(1);
			ans.add(1);
		} else {
			ans = fibList(n - 1);
//			Collections.sort(ans);
			int a = ans.get(ans.size() - 2) + ans.get(ans.size() - 1);
			ans.add(a);
		}
		return ans;
	}

	/**
	 * Return whether or not an array represents the first n numbers in a Fibonacci
	 * sequence. The Fibonacci starts with the first two numbers being 1 and 1, then
	 * starting from the 3rd number, it is the sum of the previous two numbers. The
	 * array may or may not be empty. e.g., isFibArray({1, 2}) returns false and
	 * isFibArray({1, 1, 2, 3, 5, 8}) returns true.
	 * 
	 * @param a an array
	 * @return true if input array a (of length n) represents the first n Fibonacci
	 *         numbers; false otherwise.
	 * 
	 *         You are forbidden to use the isFibList method below to solve this
	 *         problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public boolean isFibArray(int[] a) {
		/* Your Task. */
		if (a.length == 1 && a[0] == 1) {
			return true;
		} else if (a.length == 2 && a[1] == 1) {
			int[] ans = Arrays.copyOf(a, a.length - 1);
			return isFibArray(ans);
		} else if (a.length > 2 && a[a.length - 1] == (a[a.length - 2] + a[a.length - 3])) {
			int[] ans = Arrays.copyOf(a, a.length - 1);
			return isFibArray(ans);
		}
		return false;
	}

	/**
	 * Return whether or not a list represents the first n numbers in a Fibonacci
	 * sequence. The Fibonacci starts with the first two numbers being 1 and 1, then
	 * starting from the 3rd number, it is the sum of the previous two numbers. The
	 * array may or may not be empty. e.g., isFibList({1, 2}) returns false and
	 * isFibList({1, 1, 2, 3, 5, 8}) returns true.
	 * 
	 * @param a an array
	 * @return true if input list a (of length n) represents the first n Fibonacci
	 *         numbers; false otherwise.
	 * 
	 *         You are forbidden to use the isFibArray method above to solve this
	 *         problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public boolean isFibList(List<Integer> list) {
		/* Your Task. */
		if (list.size() == 1 && list.get(0) == 1) {
			return true;
		}
		if (list.size() == 2 && list.get(1) == 1) {
			list.remove(1);
			return isFibList(list);
		}
		if (list.size() > 2 && list.get(list.size() - 1) == list.get(list.size() - 2) + list.get(list.size() - 3)) {
			list.remove(list.size() - 1);
			return isFibList(list);
		}
		return false;
	}

	/**
	 * Given a sorted input array a, return a sorted array of size a.length + 1,
	 * consisting of all elements of array a and integer i.
	 * 
	 * @param a an array that is sorted in a non-descending order
	 * @param i an integer
	 * @return a sorted array of size a.length + 1, consisting of all elements of
	 *         array a and integer i.
	 * 
	 * 
	 *         You are forbidden to use the insertIntoSortedList method below to
	 *         solve this problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public int[] insertIntoSortedArray(int[] a, int i) {
		/* Your Task. */
		int position = insertIntoSortedArrayHelper(a, i);
		int[] ans = new int[a.length + 1];
		if (position == 0) {
			ans[0] = i;
			System.arraycopy(a, 0, ans, 1, ans.length - 1);
//			ans = Arrays.copyOfRange(a, 1, ans.length - 1);
			return ans;
		} else if (position == -1) {
			ans[0] = i;
			return ans;
		} else {
			System.arraycopy(a, 0, ans, 0, position);
			ans[position] = i;
			System.arraycopy(a, position, ans, position + 1, a.length - position);
			return ans;
		}
	}

	private int insertIntoSortedArrayHelper(int[] a, int i) {
		if (a.length <= 0) {
			return -1;
		}
		if (a.length == 1) {
			if (a[0] >= i) {
				return 0;
			}
			return 1;
		} else if (a[a.length - 1] <= i) {
			return a.length;
		} else {
			return insertIntoSortedArrayHelper(Arrays.copyOf(a, a.length - 1), i);
		}
	}

	/**
	 * Given a sorted input list, return a sorted list of size list.size() + 1,
	 * consisting of all elements of the input list and integer i.
	 * 
	 * @param list a list that is sorted in a non-descending order
	 * @param i    an integer
	 * @return a sorted list of size list.size() + 1, consisting of all elements of
	 *         the input list and integer i. e.g., insertIntoSortedList({1, 2, 4,
	 *         5}, 3) returns a sorted list {1, 2, 3, 4, 5}.
	 * 
	 *         You are forbidden to use the insertIntoSortedArray method above to
	 *         solve this problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public List<Integer> insertIntoSortedList(List<Integer> list, int i) {
		/* Your Task. */
		List<Integer> ans = new ArrayList<>();
		return iisl(list, ans, i, false);
	}

	private List<Integer> iisl(List<Integer> old, List<Integer> xin, int i, boolean added) {
		if (old.size() == 0) {
			xin.add(i);
			return xin;
		}
		if (xin.size() == old.size()) {
			if (added) {
				xin.add(old.get(old.size() - 1));
			} else {
				xin.add(i);
			}
			return xin;
		}
		if (added) {
			xin.add(old.get(xin.size() - 1));
			return iisl(old, xin, i, true);
		} else if (old.get(xin.size()) < i) {
			xin.add(old.get(xin.size()));
			return iisl(old, xin, i, false);
		} else {
			xin.add(i);
			return iisl(old, xin, i, true);
		}

	}

	/**
	 * Given two sorted arrays left and right, return a sorted array of size
	 * left.length + right.length, consisting of all elements of arrays left and
	 * right.
	 * 
	 * @param left  a sorted array
	 * @param right a sorted array
	 * @return a sorted array of size left.length + right.length, consisting of all
	 *         elements of arrays left and right. e.g., mergeSortedArrays({1, 3, 5,
	 *         7}, {2, 4, 6, 8}) returns a sorted array {1, 2, 3, 4, 5, 6, 7, 8}.
	 * 
	 *         You are forbidden to use the mergeSortedLists method below to solve
	 *         this problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public int[] mergeSortedArrays(int[] left, int[] right) {
		/* Your Task. */
		int[] ans = new int[left.length + right.length];
		System.arraycopy(left, 0, ans, 0, left.length);
		System.arraycopy(right, 0, ans, left.length, right.length);
		ans = msah(ans, 0);

		return ans;
	}

	private int[] msah(int[] a, int pos) {
		int i = 0;
		if (pos == a.length) {
			return a;
		}
		if (pos == 0) {
			return msah(a, pos + 1);
		} else {
			if (a[pos] < a[pos - 1]) {
				i = a[pos - 1];
				a[pos - 1] = a[pos];
				a[pos] = i;
				return msah(a, pos - 1);
			} else {
				return msah(a, pos + 1);
			}
		}

	}

	/**
	 * Given two sorted lists left and right, return a sorted list of size
	 * left.size() + right.size(), consisting of all elements of lists left and
	 * right.
	 * 
	 * @param left  a sorted list
	 * @param right a sorted list
	 * @return a sorted list of size left.size() + right.size(), consisting of all
	 *         elements of lists left and right. e.g., mergeSortedLists({1, 3, 5,
	 *         7}, {2, 4, 6, 8}) returns a sorted list {1, 2, 3, 4, 5, 6, 7, 8}.
	 * 
	 *         You are forbidden to use the mergeSortedArrays method above to solve
	 *         this problem.
	 * 
	 *         Requirement: You are required to implement all methods recursively.
	 *         You receive a zero if there is any occurrence of a loop (e.g., for,
	 *         while).
	 */
	public List<Integer> mergeSortedLists(List<Integer> left, List<Integer> right) {
		left.addAll(right);
		return mslh(left, 0);
	}

	private List<Integer> mslh(List<Integer> a, int pos) {
		int i = 0;
		if (a.size() == pos) {
			return a;
		}
		if (pos == 0) {
			return mslh(a, pos + 1);
		} else {
			if (a.get(pos) < a.get(pos - 1)) {
				i = a.get(pos - 1);
				a.set(pos - 1, a.get(pos));
				a.set(pos, i);
				return mslh(a, pos - 1);
			} else {
				return mslh(a, pos + 1);
			}
		}

	}
}
