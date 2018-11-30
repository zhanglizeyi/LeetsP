/**
Problem: Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Solution: BS for find left matched number and find right matched number. Need to understand/play with the index.
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] retArray = new int[2];
        retArray[0] = -1;
        retArray[1] = -1;
        
        //Sanity check
        if(nums == null || nums.length == 0) {
            return retArray;    
        }
       
        //Find the left matched number
        int startLeft = 0;
        int endLeft = nums.length - 1;
        
        while(startLeft < endLeft) {
            int mid = startLeft + (endLeft - startLeft) / 2;
            if(nums[mid] < target) {
                startLeft = mid + 1;
            } else {
                endLeft = mid;
            }
        }
        
        if(nums[startLeft] == target) {
            retArray[0] = startLeft;
        } else {
            retArray[0] = -1;
        }
        
        //Find the right matched number
        int startRight = 0;
        int endRight = nums.length - 1;
        
        while(startRight < endRight - 1) {
            int mid = startRight + (endRight - startRight) / 2;
            if(nums[mid] <= target) {
                startRight = mid;
            } else {
                endRight = mid - 1;
            }
        }
        
        if(nums[endRight] == target) {
            retArray[1] = endRight;
        } else if(nums[startRight] == target) {
            retArray[1] = startRight;
        } else {
            retArray[1] = -1;
        }
        
        return retArray;
    }
}
