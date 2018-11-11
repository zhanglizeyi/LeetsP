/**
Problem: 
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

The array may contain duplicates.

Example:
Input: [1,3,5]
Output: 1

Input: [2,2,2,0,1]
Output: 0

Solution: Binary search for add condition that whenever duplicate happen.

*/

class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[end]) {
                end = mid;
            } else if(nums[mid] > nums[end]){
                start = mid;
            } else {
                end--;
            }
        }
        
        if(nums[start] < nums[end]) {
            return nums[start];
        } else {
            return nums[end];
        }
    }
}
