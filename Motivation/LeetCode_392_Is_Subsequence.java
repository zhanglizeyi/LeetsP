/**
Problem: 
Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example: 
s = "abc", t = "ahbgdc"

Return true.

s = "axc", t = "ahbgdc"

Return false.

Solution: Use stack to solve the problem, or iteration and check if ind length equal to substring.
"

class Solution {
    public boolean isSubsequence(String s, String t) {
//         //brute force solution 1
//         Stack<Character> stack = new Stack<>();
        
//         //Store
//         for(int i = s.length() - 1; i >= 0; i--) {
//             stack.push(s.charAt(i));
//         }
        
//         //Read
//         for(int j = 0; j < t.length(); j++) {
//             if(!stack.isEmpty() && t.charAt(j) == stack.peek()) {
//                 stack.pop();
//             } else {
//                 //do nothing
//             }
//         }
        
//         return stack.isEmpty();
        
        if(s.length() == 0) {
            return true;
        }
        
        int sInd = 0; 
        int tInd = 0;
        
        while(tInd < t.length() && sInd < s.length()) {
            if(s.charAt(sInd) == t.charAt(tInd)) {
                sInd++;
                tInd++;
                if(sInd == s.length()) {
                    return true;
                }
            } else {
                tInd++;
            }
        }
        
        return false;
    }
}
