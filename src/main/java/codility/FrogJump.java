package codility;

import java.lang.Math;

/*
Time complexity: O(1)
 */
public class FrogJump {

    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
