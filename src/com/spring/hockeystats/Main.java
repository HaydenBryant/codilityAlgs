// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];

        Arrays.fill(counters, 0);

        int start = 0;
        int max = 0;
        for(int num : A){
            int curr = num - 1;
            if(num > N){
                start = max;
            } else if (counters[curr] < start) {
                counters[curr] = start + 1;
            } else {
                counters[curr] += 1;
            }

            if(num <= N && counters[curr] > max){
                max = counters[curr];
            }
        }

        for(int i = 0; i < counters.length; i++){
            if(counters[i] < start){
                counters[i] = start;
            }
        }
        return counters;
    }
}