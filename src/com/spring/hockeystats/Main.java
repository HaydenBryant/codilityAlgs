// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int leftTotal = A[0];
        int rightTotal = 0;

        for(int i = 0; i < A.length; i++){
            rightTotal += A[i];
        }
        rightTotal -= leftTotal;

        int dif = Math.abs(leftTotal - rightTotal);
        int minDif = dif;

        for(int i = 1; i < A.length; i++){
            leftTotal += A[i];
            rightTotal -= A[i];
            dif = Math.abs(leftTotal - rightTotal);
            if(dif < minDif){
                minDif = dif;
            }
        }
        return minDif;
    }
}
