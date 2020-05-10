package test3;

import java.util.List;

public class Test3X {
    private Test3X() {
        // prevent instantiation
    }
    
    /**
     * Returns true if the given list is sorted in increasing order,
     * and false otherwise. A list is considered to be sorted
     * if each element in the list is greater than or
     * equal to the previous element in the list. The empty list
     * is sorted.
     * 
     * <p>
     * The method does not change the elements of the list.
     * 
     * @param t a non-null list of integers
     * @return true if the given list is sorted in increasing order,
     * and false otherwise
     */
    public static boolean isSorted(List<Integer> t) {
    	if(t.size() < 2) {
    		return true;
    	}
    	if(t.get(1) >= t.get(0)) {
    		return isSorted(t.subList(1, t.size()));
    	}else {
    		return false;
    	}
    	
    }
    
    
    
    
    
    /**
     * Re-orders the elements of the argument list t so that
     * all of the positive elements of t are in the front part
     * of the list and all of the negative elements of t are
     * in the back part of the list. If the list contains zero
     * or one elements then the list is not modified. There is
     * no guarantee of the ordering of the positive elements
     * or of the negative elements.
     * 
     * <p>
     * For example, a possible solution results in the following: 
     * </p>
     * 
     * <pre>
     * if t is []                    then partition(t) makes t []
     * if t is [1]                   then partition(t) makes t [1] 
     * if t is [-1, 2]               then partition(t) makes t [2, -1]
     * if t is [1, -2, 8]            then partition(t) makes t [1, 8, -2]  
     * if t is [1, -5, -9, 4]        then partition(t) makes t [1, 4, -9, -5] 
     * if t is [-3, -7, -1, 3, -5]   then partition(t) makes t [3, -5, -1, -7, -3]
     * </pre>
     * 
     * @param t a non-null list of integers
     */
    public static void partition(List<Integer> t) {
    	if(t.size() < 2) {
    		return;
    	}
    	if(t.get(0) >= 0) {
    		partition(t.subList(1, t.size()));
    	}else {
    		t.add(t.get(0));
    		t.remove(0);
    		partition(t.subList(0, t.size() - 1));
    	}
    }

}
