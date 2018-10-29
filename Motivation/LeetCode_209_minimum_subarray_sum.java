/**
Problem:
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.

Solution: Few but two pointers is easy to understand.


*/

class Solution {
    public int minSubArrayLen(int s, int[] nums) {    
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0, j = 0;
         
        while(i < nums.length) {
            sum += nums[i++];
                                        
            while(sum >= s) {
                mini = Math.min(mini, i - j);
                System.out.println("The mini: " + mini);
                sum -= nums[j++];
            }
        }
        
        return mini == Integer.MAX_VALUE ? 0 : mini;
    }
}
