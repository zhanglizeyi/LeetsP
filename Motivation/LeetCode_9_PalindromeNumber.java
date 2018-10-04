/**
Problem: Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example:
Input: 121
Output: true

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Solution: Using Two pointers and conver int to string iterate the string from starting point 0 and ending point string length-1, if both not matched(return false), otherwise true.

*/


class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int i=0, j=str.length()-1;
        if(x<0 || str.length() == 0) {
            return false;    
        }
        
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}
