// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8


        int globalMax = 0;
        int localMax = 0;

        for(int i = 1; i < A.length; i++){
            int currMax = A[i] - A[i - 1];
            if(currMax < localMax + currMax){
                localMax = currMax + localMax;
            } else {
                localMax = currMax;
            }

            if(localMax > globalMax){
                globalMax = localMax;
            }
        }

        return globalMax;
    }
}
