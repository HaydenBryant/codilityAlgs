// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxDif = A[1] - A[0];
        int currDif = 0;

        for(int i = 2; i < A.length; i++){
            currDif = A[i] - A[i - 1];
            if(maxDif + currDif > currDif){
                maxDif = maxDif + currDif;
            } else {
                maxDif = currDif;
            }
            currDif = 0;
        }

        return maxDif;
    }
}
