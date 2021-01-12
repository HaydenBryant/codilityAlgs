// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        for(int i = 0; i < K; i++){
            int finalElm = A[A.length - 1];
            int lastElm = A[0];
            for(int j = 1; j < A.length; j++){
                int currElm = A[j];
                A[j] = lastElm;
                lastElm = currElm;
            }
            A[0] = finalElm;
        }

        return A;
    }
}
