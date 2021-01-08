// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 11
        int aTotal = 0;
        int trueTotal = A.length + 1;

        for(int i = 0; i < A.length; i++){
            aTotal += A[i];
            trueTotal += i+1;
        }

        return trueTotal - aTotal;
