package codility;

import java.util.*;
import java.util.stream.Collectors;

/*
Time complexity: O(N)
 */
class PermMissingElem {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }

        Arrays.sort(A);
        Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());
        for (int i = 1; i < set.size() + 2; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
