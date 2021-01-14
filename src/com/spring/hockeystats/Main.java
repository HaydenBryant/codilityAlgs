// you can also use imports, for example:
// import java.util.*;
import java.util.HashMap;
import java.util.Map;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int missingPair = 0;

        for(int num : A){
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for(int num : map.keySet()){
            if(map.get(num) % 2 != 0){
                missingPair = num;
            }
        }
        return missingPair;
    }
}
