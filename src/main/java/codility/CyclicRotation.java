package codility;

/*
Time complexity: O(N^2)
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if (A.length == K || A.length == 0) {
            return A;
        }
        for (int i = 0; i < K; i++) {
            int aux = A[A.length - 1];
            for (int j = A.length - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = aux;
        }

        return A;
    }
}
