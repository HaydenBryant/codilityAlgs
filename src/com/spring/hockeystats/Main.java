// you can also use imports, for example:
// import java.util.*;
import java.util.Stack;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();

        for(char c: S.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            } else if (c == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return 0;
                }
            } else if (c == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return 0;
                }
            } else if (c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return 0;
                }
            }
        }
        if(stack.isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }
}
