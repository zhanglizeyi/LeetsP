/**
problem: 
	Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Solution:
*/

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        
        int count = 1;
        int tempCount = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] < nums[i]) {
                tempCount++;
                count = Integer.max(count, tempCount);
            } else {
                tempCount=1;
            }
        }
        
        return count;
    }
}
