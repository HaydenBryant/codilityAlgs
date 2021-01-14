// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int lowestNum = 1;

        for(int i = 0; i < A.length; i++){
            if(A[i] <= 0){
                continue;
            }

            if(A[i] == lowestNum){
                continue;
            }
            if(A[i] == lowestNum + 1){
                lowestNum = A[i];
                continue;
            }

            lowestNum = A[i] - 1;
        }

        return lowestNum;
    }
}
