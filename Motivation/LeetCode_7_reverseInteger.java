/**
Problem:
Given a 32-bit signed integer, reverse digits of an integer.

Example:
Input: 123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21


Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


Solution: Using iteration result*10+input%10 (reminder) and x/=10. 

*/

class Solution {
    public int reverse(int x) {
        long result = 0;
    
        while(x != 0) {
            result = (result*10) + (x%10);
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
            x/=10;
        }
        
        return (int)result;
    }
}  
