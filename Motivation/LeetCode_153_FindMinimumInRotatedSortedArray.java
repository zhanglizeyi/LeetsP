/**
Problem:
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.


Example:
Input: [3,4,5,1,2] 
Output: 1

Input: [4,5,6,7,0,1,2]
Output: 0

Solution: Iteration or binary search

*/


class Solution {
    public int findMin(int[] nums) {
        
        //solution 1 
//         int min = Integer.MAX_VALUE; 
//         for(int i = 0; i < nums.length; i++) {
//             min = Integer.min(min, nums[i]);
//         }
        
//         return min;
        
        //solution 2
        int low = 0; 
        int high = nums.length - 1; 
        
        while(low + 1 < high) {
            int mid = low + (high - low) / 2;
            
            if(nums[mid] >= nums[high]) {
                low = mid;
            } else {
                high = mid;
            }
        }
        
        if(nums[low] < nums[high]) {
            return nums[low];
        } else {
            return nums[high];
        }
    }
}
