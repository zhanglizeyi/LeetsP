/**
Problem: Given a string, find the length of the longest substring without repeating characters.

Example: 
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3.

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


Solution: Using the feature of HashSet that no redunant elements and follow the order. Using sliding window feature, whenever set contains the char, set removes them until it could not find any matches. Otherwise, it will add the char into set and get max number from two pointers. 


1,2,3,3,4,5
i=0, j=0;

1-> j=1, set -> 1 ans=j-i=1-0=1 
2-> j=2, set -> 1,2 ans=2-0=2 
3-> j=3, set -> 1,2,3 ans=3-0=3  
4-> j=3,i=1 set-> 2,3 
5-> j=3,i=2 set-> 3
6-> j=3,i=3 set-> null 
7-> j=4,i=3 set->3 ans=3
8-> j=5,i=3 set->3,4 ans=3
9-> j=6,i=3 set->3,4,5 ans=3 

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); 
        int ret=0,i=0,j=0;
        
        while(i<s.length() && j<s.length()) {
            if(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));                    
                ret = Math.max(ret, j-i);
            }
        }
        return ret;
    }
}





