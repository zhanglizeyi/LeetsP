/**
Problem: 
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Solution: 
	Handle array length less than 3 return last value of the array. And, if array length bigger and equal than 3, then sort array and iterate the array with an counter, if previous value less than current one make the counter plus one, whenever counter adds up to two that means the third maxumum number has been found.

*/


class Solution {
    public int thirdMax(int[] nums) {
        
        if(nums.length < 3) {
            return nums[nums.length-1];
        }
        
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1; i>=1; i--) {
            if(nums[i] > nums[i-1]) {
                count++;
            }
            if(count==2) {
                return nums[i-1];
            }
        }
        
        return nums[nums.length-1];
    }
}
