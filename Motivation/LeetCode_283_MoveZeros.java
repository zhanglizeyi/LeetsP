/**
Problem:
283.Move Zeroes
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Example:
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Solution:
	Created new array and iterate original array to find all the zeros, split zeros into new array's tail and non-zero to new array's head.
*/


class Solution {
    public void moveZeroes(int[] nums) {
        //0,1,0,3,12
        //0,0,1,3,12
        int[] retNums = new int[nums.length];
        
        int tail = retNums.length-1;
        int count = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                retNums[tail--] = nums[i];
            } else {
                retNums[count++] = nums[i]; 
            }
        }
        
        for(int i=0; i<retNums.length; i++) {
            nums[i] = retNums[i];
        }

    }   
}
