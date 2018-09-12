/**
Problem: 
In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1.

Solution:
	One iteration find the largest number in the array, and use the max value to have another iteration that iterate others elements in the array with product two smaller than max value. Check condition.

*/

class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        
        int max = 0; 
        for(int i=0; i<nums.length; i++) {
            max = Integer.max(nums[i], max);
        }
        
        int index=0;
        for(int i=0; i<nums.length; i++) {
            if(max != nums[i] && nums[i]*2 > max) {
                return -1;
            }
            if(max == nums[i]) {
                index = i;   
            }
        }
    
        return index;
    }
}
