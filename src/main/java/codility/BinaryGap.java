package codility;

/*
Time complexity: O(N)
 */
public class BinaryGap {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int binaryGap = 0;
        int maxBinaryGap = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                if (binaryGap > maxBinaryGap) {
                    maxBinaryGap = binaryGap;
                }
                binaryGap = 0;
            } else if (binaryString.charAt(i) == '0') {
                binaryGap++;
            }
        }
        return maxBinaryGap;
    }
}