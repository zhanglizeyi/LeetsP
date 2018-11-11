/**
Problem:
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.


Example:
Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.

Solution: iteration with create a max value to track the index movement.

*/

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 0 || nums.length == 1) {
            return true;
        }
        
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            int value = i + nums[i];
            if(value > max && i <= max) {
                max = value;
            }
        }
        
        return max >= nums.length - 1 ? true : false;
    }
}
