/**
Problem:
Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:
Given nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.

Given nums = [0,0,1,1,1,1,2,3,3],

Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

It doesn't matter what values are set beyond the returned length.

Solution: Iteration start with index 2, and compare with 0 vs 2, 1 vs 3, 2 vs 5, 3 vs 6...etc since they wants most two elements can be repeated.

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int pos = 2;
        for(int i = 2; i < nums.length; i++) {
            if(nums[pos - 2] != nums[i]) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        
        return pos;
    }
}

