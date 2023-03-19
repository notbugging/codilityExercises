package codility;

import java.util.*;

/*
Time complexity: O(N)
 */
public class OddOcurrencesInArray {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0; i<A.length; i++) {
            if (set.contains(A[i])) {
                set.remove(A[i]);
            } else {
                set.add(A[i]);
            }
        }
        return set.iterator().next();
    }
}
