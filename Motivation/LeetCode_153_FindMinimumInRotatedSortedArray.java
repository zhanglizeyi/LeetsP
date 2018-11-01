/**

Problem: Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

Example:

Input: [3,4,5,1,2] 
Output: 1

Input: [4,5,6,7,0,1,2]
Output: 0

Solution: Binary search and need to compare mid with the tail 

*/

class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start + 1 < end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] >= nums[end]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if(nums[start] < nums[end]) {
            return nums[start];
        } else {
            return nums[end];
        }
    }
}


