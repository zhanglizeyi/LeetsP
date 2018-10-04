/**
Problem: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example:
Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "(]"
Output: false

Input: "([)]"
Output: false

Input: "{[]}"
Output: true


Solution: Using Stack and Map to handle this situation, so, put pair parentheses into map 3 pairs(easy for look up), then iterate the input string. If map doesn't contains the key then push into stack, otherwise, map contains the key and compare the map value with stack.peek() if they are matched then stack.pop() else save it into stack. After iteration, check if stack is empty return true no empty return false.

*/

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(!stack.isEmpty() && stack.peek() == map.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                } 
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        return stack.isEmpty();
    }
}
