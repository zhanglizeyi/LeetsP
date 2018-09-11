/**
Problem: 
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1:

Input: [3,0,1]
Output: 2
Example 2:

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Solution:
	1. Sorted array and check first index to make sure incresement will not miss the zero, and iterate the array to find if subtruction result bigger than 1 then retrun index minus preious index value divide two, else return the last value + 1.

*/
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
    
        if(nums[0] == 1) {
            return 0;
        }
        
        for(int i=1; i<nums.length; i++) {
            if((nums[i] - nums[i-1]) != 1) {
                return (nums[i] + nums[i-1])/2;
            }
        }
	
	/*
	int[] copyNums = new int[nums.length];
       for(int i=0; i<copyNums.length; i++) {
           copyNums[i] = i;
       }
        
       Arrays.sort(nums);
        
       for(int i=0; i<copyNums.length; i++) {
           if(nums[i] != copyNums[i]) {
               return copyNums[i];
           }
       }
	*/


        return nums[nums.length-1] + 1;
    }
}
