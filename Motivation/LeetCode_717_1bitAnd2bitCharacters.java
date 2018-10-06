/**
Problem:

We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.

Example 1:
Input: 
bits = [1, 0, 0]
Output: True
Explanation: 
The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
Example 2:
Input: 
bits = [1, 1, 1, 0]
Output: False
Explanation: 
The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.

Solution:
	Iterate input array length minus one, since the last number need always to be one character.
Iteration will start zero to input array's length minus one. Then counter will add 1 index for meeting zero or 2 indexes for meeting one. Next, summerize the counter total and compare with length-1 of input. 	
*/


class Solution {
    public boolean isOneBitCharacter(int[] bits) {    
        int i = 0;
        while(i < bits.length-1) {
            i += bits[i] + 1;                      
        }
    
        return i == bits.length-1;
    }
}
