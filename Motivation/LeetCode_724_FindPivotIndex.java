/**
Problem:
	Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Solution: Create two ints for the totoal sum and subSum, iterate int array to add all the values into sum. And then, another iteration would use sum subtract value of array and subSum, at meanwhile subSum is adding value of array.	
*/

class Solution {
    public int pivotIndex(int[] nums) {
       
        int left=0, right=0;
        for(int num:nums) {
            left += num;
        }
        
        for(int i=0; i<nums.length; i++) {
            int num = left - right - nums[i];
            if(right == num) {
                return i;
            }
            right += nums[i];
        }
        
        return -1;
    }
}

