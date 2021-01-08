// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int leftSum = 0;
        int rightSum = 0;
        int lowestDiff = Integer.MAX_VALUE;

        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                if(j < i){
                    leftSum += A[j];
                } else {
                    rightSum += A[j];
                }
            }
            int absDiff = Math.abs(leftSum - rightSum);
            if(absDiff < lowestDiff){
                lowestDiff = absDiff;
            }
            leftSum = 0;
            rightSum = 0;
        }

        return lowestDiff;
    }
}